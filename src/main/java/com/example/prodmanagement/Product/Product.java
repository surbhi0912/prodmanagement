package com.example.prodmanagement.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    Long id;
    String name;
    Double price;
    Integer quantity;
}
