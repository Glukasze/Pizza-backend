package com.pizza.model.ingredient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Ingredient {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private double price;

    public Ingredient(String name, double price) {
        this.id = (long)(Math.random() * 100000);
        this.name = name;
        this.price = price;
    }
}
