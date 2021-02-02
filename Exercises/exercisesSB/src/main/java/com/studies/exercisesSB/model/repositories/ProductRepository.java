package com.studies.exercisesSB.model.repositories;

import com.studies.exercisesSB.model.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
