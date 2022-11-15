package com.joaogodoi.SpringBootWithJPA.repositories;

import com.joaogodoi.SpringBootWithJPA.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
