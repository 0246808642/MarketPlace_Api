package com.example.Market_Api.entity;

import com.example.Market_Api.Enum.Specialty;
import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Supplier supplier;
}
