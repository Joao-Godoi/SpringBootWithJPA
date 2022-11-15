package com.joaogodoi.SpringBootWithJPA.resources;

import com.joaogodoi.SpringBootWithJPA.entities.Category;
import com.joaogodoi.SpringBootWithJPA.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        List<Category> allCategory = categoryService.findAll();
        return ResponseEntity.ok().body(allCategory);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category categoryById = categoryService.findById(id);
        return ResponseEntity.ok().body(categoryById);
    }
}
