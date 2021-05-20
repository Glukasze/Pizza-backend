package com.pizza.model.pizza;

import com.pizza.model.ingredient.Mozzarella;
import com.pizza.model.ingredient.Parmezan;
import com.pizza.model.ingredient.TomatoSauce;

public class Cheesy extends Pizza {

    public Cheesy() {
        super("Cheesy", 3L, true, new TomatoSauce(), new Parmezan(), new Mozzarella());
    }
}
