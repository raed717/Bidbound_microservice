package com.microservice.product.product.Repositories;

import com.microservice.product.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
