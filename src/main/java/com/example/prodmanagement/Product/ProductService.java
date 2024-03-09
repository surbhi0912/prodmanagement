package com.example.prodmanagement.Product;

import com.example.prodmanagement.ProdmanagementApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductService {


    public ResponseEntity<String> addProduct(ProductDTO productDTO){
        if(ProdmanagementApplication.productMap.containsKey(productDTO.getName())){
            return new ResponseEntity<>("Product already exists", HttpStatus.BAD_REQUEST);
        }
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(product.getQuantity());
        ProdmanagementApplication.productMap.put(productDTO.getName(), product);
        return new ResponseEntity<>("Successfully added product", HttpStatus.OK);
    }

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        products.addAll(ProdmanagementApplication.productMap.values());
        return products;
    }
}
