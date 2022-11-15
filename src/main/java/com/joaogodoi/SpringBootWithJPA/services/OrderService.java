package com.joaogodoi.SpringBootWithJPA.services;

import com.joaogodoi.SpringBootWithJPA.entities.Order;
import com.joaogodoi.SpringBootWithJPA.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long orderId) {
        Optional<Order> orderById = orderRepository.findById(orderId);
        return orderById.get();
    }

}
