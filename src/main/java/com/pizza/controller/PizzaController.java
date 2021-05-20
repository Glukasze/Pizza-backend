package com.pizza.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pizza.model.ingredient.AllIngredients;
import com.pizza.model.order.UserOrder;
import com.pizza.model.pizza.AllPizzas;
import com.pizza.model.pizza.Pizza;
import com.pizza.service.PizzaService;
import com.pizza.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PizzaController {

    private final PizzaService pizzaService;
    private final UserOrderService userOrderService;

    private UserOrder userOrder = new UserOrder();
    private AllPizzas allPizzas = new AllPizzas();



    @Autowired
    public PizzaController(PizzaService pizzaService,
                           UserOrderService userOrderService) {
        this.pizzaService = pizzaService;
        this.userOrderService = userOrderService;
    }


    @GetMapping("/menu")
    public String getMenu() {

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(allPizzas.getPizzas());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/order")
    public String getOrder() {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(userOrder.getPizzas());
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

    @PostMapping("/save-pizza")
    @ResponseBody
    public Pizza save(@RequestBody Pizza pizza) {
        return pizzaService.save(pizza);
    }

    @DeleteMapping("/delete-pizza/{id}")
    @ResponseBody
    public void deletePizza(@PathVariable("id") Long id) {
        Optional<Pizza> optional = pizzaService.findById(id);
        optional.ifPresent(pizza -> pizzaService.delete(pizza));
        System.out.println("deleted " + id);
    }

    @PostMapping("/add-to-order")
    public void addToOrder(@RequestBody() Pizza pizza) {
        this.userOrder.getPizzas().add(pizza);
    }

    @DeleteMapping("delete-from-order/{id}")
    public void deleteFromOrder(@PathVariable("id") Long id) {
        Pizza pizza = userOrder.findById(id);
        this.userOrder.getPizzas().remove(pizza);
    }

}
