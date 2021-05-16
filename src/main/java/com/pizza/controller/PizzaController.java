package com.pizza.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pizza.model.ingredient.AllIngredients;
import com.pizza.model.product.pizza.AllPizzas;
import com.pizza.model.product.pizza.Pizza;
import com.pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PizzaController {

    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/menu")
    public String getMenu() {
        AllPizzas allPizzas = new AllPizzas();
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(allPizzas.getPizzas());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/ingredients")
    public String getIngredients() {
        AllIngredients allIngredients = new AllIngredients();
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(allIngredients.getIngredients());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/menu")
    public Pizza save(@RequestBody () Pizza pizza) {
        return pizzaService.save(pizza);
    }
}
