package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.*;

public class Gabriela extends Pizza {

    public Gabriela() {
        super("Gabriela", 1L, true,
                new TomatoSauce(), new Tomato(), new Onion(), new Jalapeno());
    }
}
