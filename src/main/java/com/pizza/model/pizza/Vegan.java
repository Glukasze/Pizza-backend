package com.pizza.model.pizza;

import com.pizza.model.ingredient.*;

public class Vegan extends Pizza {

    public Vegan() {
        super("Vegan", 10L, false, new TomatoSauce(),
                new Mushrooms(), new Onion(), new Broccoli(), new Corn(), new Paprika(), new Olives());
    }
}
