package com.example.task2.service;

import com.example.task2.dto.ProductDto;
import com.example.task2.entity.Product;
import com.example.task2.mapper.ProductMapper;
import com.example.task2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public Product create(ProductDto dto) {
        return repository.save(ProductMapper.toEntity(dto));
    }

    @Override
    public Product update(Long id, ProductDto dto) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existing.setName(dto.getName());
        existing.setPrice(dto.getPrice());
        existing.setQuantity(dto.getQuantity());
        existing.setDescription(dto.getDescription());

        return repository.save(existing);
    }

    @Override
    public Product getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}