package com.pizza.model.ingredient;

import java.util.ArrayList;
import java.util.List;

public class AllIngredients {

    private List<Ingredient> ingredients = new ArrayList<>();

    public AllIngredients() {
        this.ingredients.add(new Beef());
        this.ingredients.add(new Broccoli());
        this.ingredients.add(new Cheese());
        this.ingredients.add(new Chicken());
        this.ingredients.add(new Corn());
        this.ingredients.add(new Ham());
        this.ingredients.add(new Jalapeno());
        this.ingredients.add(new Mozzarella());
        this.ingredients.add(new Mushrooms());
        this.ingredients.add(new Olives());
        this.ingredients.add(new Onion());
        this.ingredients.add(new Paprika());
        this.ingredients.add(new Parmezan());
        this.ingredients.add(new Pineapple());
        this.ingredients.add(new Rucola());
        this.ingredients.add(new Salami());
        this.ingredients.add(new Tomato());
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
