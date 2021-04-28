package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.*;

public class Meatzza extends Pizza {

    public Meatzza() {
        super("Meatzza", 1L, true, new TomatoSauce(), new Ham(), new Chicken(), new Beef());
    }
}
