package com.joaogodoi.SpringBootWithJPA.resources;

import com.joaogodoi.SpringBootWithJPA.entities.Product;
import com.joaogodoi.SpringBootWithJPA.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        List<Product> allProducts = productService.findAll();
        return ResponseEntity.ok().body(allProducts);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product productById = productService.findById(id);
        return ResponseEntity.ok().body(productById);
    }
}
