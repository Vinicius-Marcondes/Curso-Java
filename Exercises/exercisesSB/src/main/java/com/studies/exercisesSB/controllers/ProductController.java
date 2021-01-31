package com.studies.exercisesSB.controllers;

import com.studies.exercisesSB.model.entities.Product;
import com.studies.exercisesSB.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product newProduct(Product product) {
        productRepository.save(product);
        return product;
    }

//    public @ResponseBody Product newProduct(@RequestParam("name") String name, @RequestParam("price") float price, @RequestParam("discount") float discount) {
//        Product product = new Product(name, price, discount);
//        productRepository.save(product);
//        return product;
//    }
}
