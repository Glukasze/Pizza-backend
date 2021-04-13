package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.Ingredient;
import com.pizza.model.ingredient.TomatoSauce;
import com.pizza.model.product.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Inheritance
public class Pizza extends Product {

    private boolean cheese;
    private transient Ingredient sauce;
    private transient List<Ingredient> toppings = new ArrayList<>();

    public Pizza(String name, Long pictureId, boolean cheese, Ingredient sauce, Ingredient ... toppings) {
        super(name, pictureId);
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings.addAll(Arrays.asList(toppings));
    }
}
