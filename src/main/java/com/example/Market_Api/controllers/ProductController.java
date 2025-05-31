package com.example.Market_Api.controllers;

import com.example.Market_Api.entity.Product;
import com.example.Market_Api.productDTO.DataRegistrationProduct;
import com.example.Market_Api.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DataRegistrationProduct data){
        repository.save(new Product(data));
    }
}
