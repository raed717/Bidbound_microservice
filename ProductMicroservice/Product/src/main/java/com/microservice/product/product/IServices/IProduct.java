package com.microservice.product.product.IServices;

import com.microservice.product.product.entities.Product;

import java.util.List;


public interface IProduct {

    List<Product> findAllProducts();

    Product findProductById(Integer id);

    Product createProduct(Product answer);

    void deleteProduct(Integer id);


}
