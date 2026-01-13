package com.example.task2.dto;

import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private Double price;
    private Integer quantity;
    private String description;
}