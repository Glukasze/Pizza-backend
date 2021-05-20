package com.pizza.model.pizza;

import com.pizza.model.ingredient.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Pizza {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String pizzaName;
    private Long pictureId;
    private boolean cheese;

    @OneToOne(cascade = CascadeType.ALL)
    private Ingredient sauce;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingredient> toppings = new ArrayList<>();
    private String toppingsString = "";
    private double price;

    public Pizza(String name, Long pictureId, boolean cheese, Ingredient sauce, Ingredient ... toppings) {
        this.id = (long)(Math.random() * 100000);
        this.pizzaName = name;
        this.pictureId = pictureId;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings.addAll(Arrays.asList(toppings));
        calculatePrice();
        createToppingsString();
    }

    private void createToppingsString() {
        for (int i = 0; i < toppings.size(); i++) {
            this.toppingsString += toppings.get(i).getName();
            if (i < toppings.size() - 1) {
                this.toppingsString += ", ";
            }
        }
    }

    private void calculatePrice() {
        double temp = 10;
        if (toppings.size() > 0) {
            for (Ingredient ingredient: toppings) {
                temp += ingredient.getPrice();
            }
        }
        this.price = temp;
    }


}
