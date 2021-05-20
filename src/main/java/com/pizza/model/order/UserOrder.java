package com.pizza.model.order;

import com.pizza.model.pizza.Pizza;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
//@NoArgsConstructor
public class UserOrder {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pizza> pizzas = new ArrayList<>();
    private String pizzasAsString;

    public void setString() {
        this.pizzasAsString = "";
        for (int i = 0; i < pizzas.size(); i++) {
            this.pizzasAsString += pizzas.get(i).getPizzaName();
            if (i < pizzas.size() - 1) {
                this.pizzasAsString += ", ";
            }
        }
    }

    public UserOrder() {
        this.id = (long)(Math.random() * 100000);
    }


    public Pizza findById(Long id) {
        for (Pizza pizza : this.pizzas) {
            if (pizza.getId().equals(id)) {
                return pizza;
            }
        }
        return null;
    }

}
