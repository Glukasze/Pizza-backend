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
        super("Rozano", 1L, true, new TomatoSauce(),
                new Ham(), new Onion(), new Corn(), new GarlicSauce());
    }
}
