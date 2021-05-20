package com.pizza.model.pizza;

import com.pizza.model.ingredient.*;

public class Bianca extends Pizza {

    public Bianca() {
        super("Bianca", 2L, true, new GarlicSauce(), new Onion(), new Corn(), new Ham());
    }
}
