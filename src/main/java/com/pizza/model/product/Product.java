package com.pizza.model.product;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Inheritance
public abstract class Product {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private Long pictureId;

    public Product(String productName, Long pictureId) {
        this.id = (long) (Math.random() * 10000);
        this.productName = productName;
        this.pictureId = pictureId;
    }
}
