package com.pizza.model.pizza;

import com.pizza.model.ingredient.*;

public class Gabriela extends Pizza {

    public Gabriela() {
        super("Gabriela", 4L, true,
                new TomatoSauce(), new Salami(), new Corn(), new Onion(), new Jalapeno());
    }
}
