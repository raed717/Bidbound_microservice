package com.microservice.product.product.entities;

import java.io.Serializable;
import com.microservice.product.product.entities.Product;
import jakarta.persistence.*;
import lombok.*;


 import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity


public class enchere implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    @OneToOne
    private Product product;

}
