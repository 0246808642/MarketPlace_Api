package com.example.Market_Api.controllers;

import com.example.Market_Api.productDTO.DataRegistrationProduct;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @PostMapping
    public void cadastrar(@RequestBody DataRegistrationProduct data){
        System.out.println(data);

    }
}
