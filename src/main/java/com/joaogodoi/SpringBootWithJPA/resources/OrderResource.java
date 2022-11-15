package com.joaogodoi.SpringBootWithJPA.resources;

import com.joaogodoi.SpringBootWithJPA.entities.Order;
import com.joaogodoi.SpringBootWithJPA.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAll() {
        List<Order> allOrders = orderService.findAll();
        return ResponseEntity.ok().body(allOrders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order orderById = orderService.findById(id);
        return ResponseEntity.ok().body(orderById);
    }
}
