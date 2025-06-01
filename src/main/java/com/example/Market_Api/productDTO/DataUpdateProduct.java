package com.example.Market_Api.productDTO;

import com.example.Market_Api.supplierDTO.DataGetSupplier;
import com.example.Market_Api.supplierDTO.DataSupplier;
import jakarta.validation.constraints.NotNull;

public record DataUpdateProduct(
        @NotNull
        Long id,
        String name,
        DataGetSupplier supplier) {
}
