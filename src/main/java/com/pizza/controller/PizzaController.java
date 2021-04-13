package com.pizza.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pizza.model.order.Order;
import com.pizza.model.product.Product;
import com.pizza.model.product.pizza.AllPizzas;
import com.pizza.model.product.pizza.Margherita;
import com.pizza.model.product.pizza.Pizza;
import com.pizza.model.product.pizza.Rozano;
import com.pizza.repository.PizzaRepository;
import com.pizza.service.PizzaService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PizzaController {

    private PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    public void test() {
        save(new Rozano());
        save(new Margherita());
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

    @PostMapping("/menu")
    public Pizza save(@RequestBody () Pizza pizza) {
        return pizzaService.save(pizza);
    }
}
