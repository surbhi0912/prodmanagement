package com.example.prodmanagement;

import com.example.prodmanagement.Product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ProdmanagementApplication {
	public static Map<String, Product> productMap = new HashMap<>();
	public static void main(String[] args) {
		SpringApplication.run(ProdmanagementApplication.class, args);
	}

}
