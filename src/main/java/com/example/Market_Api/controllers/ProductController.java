package com.example.Market_Api.controllers;

import com.example.Market_Api.entity.Product;
import com.example.Market_Api.productDTO.DataGetProduct;
import com.example.Market_Api.productDTO.DataRegistrationProduct;
import com.example.Market_Api.productDTO.DataUpdateProduct;
import com.example.Market_Api.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid DataRegistrationProduct data){
        repository.save(new Product(data));
    }

    @GetMapping
    public Page<DataGetProduct> list(@PageableDefault(size = 10,sort = {"name"}) Pageable pag){
        return repository.findAllByActiveTrue(pag).map(DataGetProduct::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdateProduct data){
        var product = repository.getReferenceById(data.id());
        product.updateInfo(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        var product = repository.getReferenceById(id);
        product.delete();
    }

}
