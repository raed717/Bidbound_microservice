package com.microservice.product.product.Services;


import com.microservice.product.product.IServices.IProduct;
import com.microservice.product.product.Repositories.ProductRepo;
import com.microservice.product.product.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ProductService implements IProduct {

    ProductRepo productRepo;

    @Override
    public List<Product> findAllProducts () {
        return productRepo.findAll ();
    }

    @Override
    public Product findProductById (Integer id) {
        return productRepo.findById (id).orElse (null);
    }

    @Override
    public Product createProduct (Product answer) {
        return  productRepo.save (answer);
    }

    @Override
    public void deleteProduct (Integer id) {
        productRepo.deleteById (id);

    }
}
