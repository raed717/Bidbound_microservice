package com.microservice.product.product.Controller;

import com.microservice.product.product.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.microservice.product.product.IServices.IProduct;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/produits")

public class ProductController {

IProduct serv;

    @GetMapping("/list-product")
    public List<Product> getProduits() {
        List<Product> prd = serv.findAllProducts ();
        return prd;
    }




    @DeleteMapping("/delete-prd/{id}")
    public void delete (@PathVariable Integer id) {
        serv.deleteProduct (id);
    }
@PostMapping("/create")
    public Product createProduct (@RequestBody Product product) {
        return serv.createProduct (product);
    }


    @GetMapping("/find-product/{id}")
    public Product findProductById (@PathVariable Integer id) {
        return serv.findProductById (id);
    }
 }

