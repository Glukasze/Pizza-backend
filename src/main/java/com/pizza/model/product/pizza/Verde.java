package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.Ingredient;
import com.pizza.model.ingredient.Rucola;
import com.pizza.model.ingredient.Tomato;
import com.pizza.model.ingredient.TomatoSauce;

public class Verde extends Pizza {
    public Verde() {
        super("Verde", 11L, true, new TomatoSauce(), new Rucola(), new Tomato());
    }
}
