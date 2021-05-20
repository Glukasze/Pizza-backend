package com.pizza.model.pizza;


import com.pizza.model.ingredient.*;
import lombok.Data;

@Data
//@Entity
public class Margherita extends Pizza {

    public Margherita() {
        super("Margherita", 6L, true, new TomatoSauce());
    }
}
