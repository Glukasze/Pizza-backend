package com.pizza.service;

import com.pizza.model.product.pizza.Pizza;
import com.pizza.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    private PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

}
