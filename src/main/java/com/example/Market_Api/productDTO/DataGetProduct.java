package com.example.Market_Api.productDTO;

import com.example.Market_Api.Enum.Specialty;
import com.example.Market_Api.entity.Product;

public record DataGetProduct(String name, String code, Specialty specialty) {

    public DataGetProduct(Product product) {
        this(product.getName(),product.getCode(),product.getSpecialty());
    }
}
