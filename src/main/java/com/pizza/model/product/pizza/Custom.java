package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.Ingredient;
import com.pizza.model.ingredient.TomatoSauce;

public class Custom extends Pizza {
    public Custom() {
        super("Custom", 12L, false, new TomatoSauce());
    }
}
