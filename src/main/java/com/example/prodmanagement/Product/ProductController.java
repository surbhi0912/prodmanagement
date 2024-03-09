package com.example.prodmanagement.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/api/product/add")
    public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }

    @GetMapping("/api/product/get-all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

}
