package com.studies.exercisesSB.controllers;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.expression.spel.ast.OpInc;
import org.springframework.web.bind.annotation.*;

import com.studies.exercisesSB.model.entities.Product;
import com.studies.exercisesSB.model.repositories.ProductRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product saveProduct(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @GetMapping
    public Iterable<Product> getProduct() {
        return productRepository.findAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Product> getProductById(@PathVariable("id") int id) {
        return productRepository.findById(id);
    }

    @GetMapping(path = "/page/{pageNumber}")
    public Iterable<Product> getProductByPage(@PathVariable int pageNumber, @PathVariable("qtdPage") int qtdPage) {
        if (qtdPage > 5) {
            qtdPage = 5;
        }
        if (qtdPage < 1) {
            qtdPage = 1;
        }
        Sort sort;
        Pageable page = PageRequest.of(pageNumber, 3);
        return productRepository.findAll(page);
    }

    @PutMapping
    public Product updateProduct(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }

}
