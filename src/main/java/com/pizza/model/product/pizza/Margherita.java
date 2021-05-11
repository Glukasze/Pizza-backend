package com.pizza.model.product.pizza;


import com.pizza.model.ingredient.*;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.List;

@Data
//@Entity
public class Margherita extends Pizza {

    public Margherita() {
        super("Margherita", 6L, true, new TomatoSauce());
    }
}
