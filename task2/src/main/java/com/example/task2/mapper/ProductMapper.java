package com.example.task2.mapper;

import com.example.task2.dto.ProductDto;
import com.example.task2.entity.Product;

public class ProductMapper {

    public static Product toEntity(ProductDto dto) {
        return Product.builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .quantity(dto.getQuantity())
                .description(dto.getDescription())
                .build();
    }

    public static ProductDto toDto(Product product) {
        ProductDto dto = new ProductDto();
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setQuantity(product.getQuantity());
        dto.setDescription(product.getDescription());
        return dto;
    }
}