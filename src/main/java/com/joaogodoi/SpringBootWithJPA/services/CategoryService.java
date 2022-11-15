package com.joaogodoi.SpringBootWithJPA.services;

import com.joaogodoi.SpringBootWithJPA.entities.Category;
import com.joaogodoi.SpringBootWithJPA.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long categoryId) {
        Optional<Category> categoryById = categoryRepository.findById(categoryId);
        return categoryById.get();
    }

}
