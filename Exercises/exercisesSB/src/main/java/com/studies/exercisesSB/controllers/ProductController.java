package com.studies.exercisesSB.controllers;

import com.studies.exercisesSB.model.entities.Product;
import com.studies.exercisesSB.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product newProduct(String name) {
        Product product = new Product(name);
        productRepository.save(product);
        return product;
    }
}
