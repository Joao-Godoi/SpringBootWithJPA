package com.joaogodoi.SpringBootWithJPA.repositories;

import com.joaogodoi.SpringBootWithJPA.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
