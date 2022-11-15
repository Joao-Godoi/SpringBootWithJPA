package com.joaogodoi.SpringBootWithJPA.repositories;

import com.joaogodoi.SpringBootWithJPA.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
