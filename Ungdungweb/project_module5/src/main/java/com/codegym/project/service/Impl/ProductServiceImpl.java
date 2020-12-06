package com.codegym.project.service.Impl;

import com.codegym.project.model.Product;
import com.codegym.project.repository.ProductRepository;
import com.codegym.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(long id) {
        return  productRepository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean delete(long id) {
        Product product=this.findById(id);
        if (product==null){
            return false;
        }
        productRepository.save(product);
        return true;
    }
}
