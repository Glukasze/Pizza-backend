package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.List;

@Data
//@Entity
public class Rozano extends Pizza {

    public Rozano() {
        super("Rozano", 9L, true, new TomatoSauce(),
                new Salami(), new Onion(), new Mushrooms());
    }
}
