package com.example.Market_Api.entity;

import com.example.Market_Api.supplierDTO.DataGetSupplier;
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

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getSupplier_Name() {
        return supplier_Name;
    }

    public String getEmail() {
        return email;
    }

    public String getComplement() {
        return complement;
    }

    public String getCity() {
        return city;
    }

    public void update(DataGetSupplier supplier) {
        if(supplier.supplier_Name() != null){
            this.supplier_Name = supplier.supplier_Name();
        }
        if(supplier.email() != null){
            this.email = supplier.email();
        }
        if(supplier.cep() != null){
            this.cep = supplier.cep();
        }
        if(supplier.telephone() != null){
            this.telephone = supplier.telephone();
        }
        if(supplier.uf() != null){
            this.uf = supplier.uf();
        }
        if(supplier.city() != null){
            this.city = supplier.city();
        }
    }
}
