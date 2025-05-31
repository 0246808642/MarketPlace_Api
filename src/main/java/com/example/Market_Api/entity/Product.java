package com.example.Market_Api.entity;

import com.example.Market_Api.Enum.Specialty;
import com.example.Market_Api.productDTO.DataRegistrationProduct;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "products")
@Entity(name = "Product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
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

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String amount;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Supplier supplier;

    public Product(DataRegistrationProduct data) {
        this.name = data.name();
        this.code = data.code();
        this.amount = data.amount();
        this.specialty = data.specialty();
        this.supplier = new Supplier(data.supplier());

    }


}
