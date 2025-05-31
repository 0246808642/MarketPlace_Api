package com.example.Market_Api.entity;

import com.example.Market_Api.supplierDTO.DataSupplier;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    private String supplier_Name;
    private String email;
    private String city;
    private String cep;
    private String uf;
    private String complement;
    private String telephone;

    public Supplier(DataSupplier dataSupplier) {
        this.supplier_Name = dataSupplier.supplier_Name();
        this.city = dataSupplier.city();
        this.email = dataSupplier.email();
        this.cep = dataSupplier.cep();
        this.uf = dataSupplier.uf();
        this.telephone = dataSupplier.telephone();
        this.complement = dataSupplier.complement();
    }
}
