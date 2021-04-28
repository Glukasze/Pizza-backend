package com.pizza.model.product.pizza;

import com.pizza.model.ingredient.Pineapple;

import java.util.ArrayList;
import java.util.List;

public class AllPizzas {

    private List<Pizza> pizzas = new ArrayList<>();

    public AllPizzas() {
        this.pizzas.add(new Margherita());
        this.pizzas.add(new Angela());
        this.pizzas.add(new Romana());
        this.pizzas.add(new Gabriela());
        this.pizzas.add(new Vegan());
        this.pizzas.add(new Rozano());
        this.pizzas.add(new Hawaiian());
        this.pizzas.add(new Meatzza());
        this.pizzas.add(new Cheesy());
        this.pizzas.add(new Bianca());

    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
