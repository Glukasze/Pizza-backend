package com.pizza.model.product.pizza;

import java.util.ArrayList;
import java.util.List;

public class AllPizzas {

    private List<Pizza> pizzas = new ArrayList<>();

    public AllPizzas() {
        this.pizzas.add(new Margherita());
        this.pizzas.add(new Rozano());
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
