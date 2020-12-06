package com.codegym.project.controller.api;

import com.codegym.project.model.Product;
import com.codegym.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ApiProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/products/")
    public ResponseEntity<List<Product>> listProducts() {
        List<Product> productList = productService.findAll();
        if (productList.isEmpty()){
            return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
    }

}
