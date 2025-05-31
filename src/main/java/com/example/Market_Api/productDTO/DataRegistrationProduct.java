package com.example.Market_Api.productDTO;

import com.example.Market_Api.Enum.Specialty;
import com.example.Market_Api.supplierDTO.DataSupplier;

public record DataRegistrationProduct(String name, String code, String amount, Specialty specialty, DataSupplier supplier) {

}
