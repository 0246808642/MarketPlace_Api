package com.example.Market_Api.productDTO;

import com.example.Market_Api.Enum.Specialty;
import com.example.Market_Api.supplierDTO.DataSupplier;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DataRegistrationProduct(
        @NotBlank
        String name,
        @NotBlank
                @Pattern(regexp = "\\d{6}")
        String code,
        @NotBlank
        String amount,
        @NotNull
        Specialty specialty,
        @NotNull
                @Valid
        DataSupplier supplier
) {

}
