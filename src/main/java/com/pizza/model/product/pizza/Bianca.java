package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.*;

public class Bianca extends Pizza {

    public Bianca() {
        super("Bianca", 1L, true, new GarlicSauce(), new Onion(), new Corn(), new Chicken());
    }
}
