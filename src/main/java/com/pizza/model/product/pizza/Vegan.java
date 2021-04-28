package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.*;

public class Vegan extends Pizza {

    public Vegan() {
        super("Vegan", 1L, false, new TomatoSauce(),
                new Corn(), new Jalapeno(), new Mushrooms(), new Onion(), new Tomato());
    }
}
