package com.pizza.model.product;


import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Inheritance
public abstract class Product {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long pictureId;

    public Product(String name, Long pictureId) {
        this.id = (long) (Math.random() * 10000);
        this.name = name;
        this.pictureId = pictureId;
    }
}
