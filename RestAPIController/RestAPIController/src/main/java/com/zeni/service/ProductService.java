package com.zeni.service;

import com.zeni.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> getProducts(String name, Double price, Pageable pageable);
    Optional<Product> getProductById(Long id);
    Product saveProduct(Product product);
    boolean deleteProduct(Long id);
}
