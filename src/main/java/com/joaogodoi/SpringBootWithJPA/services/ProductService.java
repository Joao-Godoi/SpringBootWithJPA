package com.joaogodoi.SpringBootWithJPA.services;

import com.joaogodoi.SpringBootWithJPA.entities.Product;
import com.joaogodoi.SpringBootWithJPA.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long ProductId) {
        Optional<Product> productById = productRepository.findById(ProductId);
        return productById.get();
    }

}
