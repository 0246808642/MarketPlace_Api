package com.example.Market_Api.productDTO;

import com.example.Market_Api.Enum.Specialty;
import com.example.Market_Api.entity.Product;
import com.example.Market_Api.supplierDTO.DataGetSupplier;
import com.example.Market_Api.supplierDTO.DataSupplier;

public record  DataGetProduct(Long id, String name, String code, Specialty specialty, DataGetSupplier supplier) {

    public DataGetProduct(Product product) {
        this(product.getId(),product.getName(),product.getCode(),product.getSpecialty(),
                new DataGetSupplier(
                product.getSupplier().getSupplier_Name(),
                product.getSupplier().getEmail(),
                product.getSupplier().getCep(),
                product.getSupplier().getTelephone(),
                product.getSupplier().getUf(),
                product.getSupplier().getCity()
        ));
    }
}
