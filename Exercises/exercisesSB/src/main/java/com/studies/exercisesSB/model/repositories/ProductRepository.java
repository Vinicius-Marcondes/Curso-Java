package com.studies.exercisesSB.model.repositories;

import com.studies.exercisesSB.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
