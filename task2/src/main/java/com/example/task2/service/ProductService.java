package com.example.task2.service;

import com.example.task2.dto.ProductDto;
import com.example.task2.entity.Product;

import java.util.List;

public interface ProductService {
    Product create(ProductDto dto);
    Product update(Long id, ProductDto dto);
    Product getById(Long id);
    List<Product> getAll();
    void delete(Long id);
}