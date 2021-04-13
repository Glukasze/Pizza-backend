package com.pizza;

import com.pizza.repository.PizzaRepository;
import com.pizza.service.PizzaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzaApplication.class, args);

        System.out.println("Hello");
    }

}
