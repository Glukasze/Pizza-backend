package com.pizza.model.pizza;

import com.pizza.model.ingredient.*;
import lombok.Data;

@Data
//@Entity
public class Rozano extends Pizza {

    public Rozano() {
        super("Rozano", 9L, true, new TomatoSauce(),
                new Salami(), new Onion(), new Mushrooms());
    }
}
