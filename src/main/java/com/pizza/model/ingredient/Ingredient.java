package com.pizza.model.ingredient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
public abstract class Ingredient {

    private Long id;
    private String name;
    private double price;

    public Ingredient(String name, double price) {
        this.id = (long) (Math.random() * 10000);
        this.name = name;
        this.price = price;
    }
}
