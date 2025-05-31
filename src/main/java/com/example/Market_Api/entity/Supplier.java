package com.example.Market_Api.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Supplier {
    private String name;
    private String city;
    private String cep;
    private String uf;
}
