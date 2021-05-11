package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.Ham;
import com.pizza.model.ingredient.Ingredient;
import com.pizza.model.ingredient.Mushrooms;
import com.pizza.model.ingredient.TomatoSauce;

public class Romana extends Pizza {

    public Romana() {
        super("Romana", 8L, true, new TomatoSauce(), new Mushrooms(), new Ham());
    }
}
