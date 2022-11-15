package com.joaogodoi.SpringBootWithJPA.repositories;

import com.joaogodoi.SpringBootWithJPA.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
}
