package com.codegym.project.service;

import com.codegym.project.model.Product;

import java.util.List;

public interface ProductService extends BaseService<Product> {
    public List<Product> findAllProductDeleted();
}
