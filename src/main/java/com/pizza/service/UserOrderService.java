package com.pizza.service;

import com.pizza.model.order.UserOrder;
import com.pizza.model.pizza.Pizza;
import com.pizza.repository.UserOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserOrderService {

    private UserOrderRepository userOrderRepository;

    public UserOrderService(UserOrderRepository userOrderRepository) {
        this.userOrderRepository = userOrderRepository;
    }

    public Optional<UserOrder> findById(Long id) {
        return userOrderRepository.findById(id);
    }

    public UserOrder save(UserOrder userOrder) {
        return userOrderRepository.save(userOrder);
    }

    public void delete(UserOrder userOrder) {
        userOrderRepository.delete(userOrder);
    }

    public void addPizza(Long userOrderId, Pizza pizza) {
        findById(userOrderId).ifPresent(userOrder -> {

            userOrder.getPizzas().add(pizza);
        });
    }

    public void deletePizza(Long userOrderId, Pizza pizza) {
        findById(userOrderId).ifPresent(userOrder -> {
            userOrder.getPizzas().remove(pizza);
        });
    }

//    public Optional<Pizza[]> findAllPizzas(UserOrder userOrder) {
//        Optional<Pizza[]> allPizzas;
//
//    }

}
