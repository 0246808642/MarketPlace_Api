package com.example.Market_Api.entity;

import com.example.Market_Api.Enum.Specialty;
import com.example.Market_Api.productDTO.DataRegistrationProduct;
import com.example.Market_Api.productDTO.DataUpdateProduct;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Table(name = "products")
@Entity(name = "Product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String amount;
    private boolean active;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Supplier supplier;

    public Product(DataRegistrationProduct data) {
        this.active = true;
        this.name = data.name();
        this.code = data.code();
        this.amount = data.amount();
        this.specialty = data.specialty();
        this.supplier = new Supplier(data.supplier());

    }

    public Long getId() {
        return id;
    }

    public String getAmount() {
        return amount;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void updateInfo(@Valid DataUpdateProduct data) {
        if(data.name() != null) {
            this.name = data.name();
        }
        if(data.supplier() != null) {
            this.supplier.update(data.supplier());
        }


    }

    public void delete() {
        this.active = false;
    }
}
