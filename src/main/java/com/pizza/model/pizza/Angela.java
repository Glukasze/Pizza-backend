package com.pizza.model.pizza;

import com.pizza.model.ingredient.Mushrooms;
import com.pizza.model.ingredient.TomatoSauce;
import lombok.Data;

@Data
public class Angela extends Pizza {

    public Angela() {
        super("Angela", 1L, true, new TomatoSauce(), new Mushrooms());
    }
}
