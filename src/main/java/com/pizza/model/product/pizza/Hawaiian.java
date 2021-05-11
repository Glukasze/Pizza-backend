package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.Ham;
import com.pizza.model.ingredient.Ingredient;
import com.pizza.model.ingredient.Pineapple;
import com.pizza.model.ingredient.TomatoSauce;

public class Hawaiian extends Pizza {

    public Hawaiian() {
        super("Hawaiian", 5L, true, new TomatoSauce(), new Ham(), new Pineapple());
    }
}
