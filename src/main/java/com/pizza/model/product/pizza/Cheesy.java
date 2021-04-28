package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.Ingredient;
import com.pizza.model.ingredient.Mozzarella;
import com.pizza.model.ingredient.Parmezan;
import com.pizza.model.ingredient.TomatoSauce;

public class Cheesy extends Pizza {

    public Cheesy() {
        super("Cheesy", 1L, true, new TomatoSauce(), new Parmezan(), new Mozzarella());
    }
}
