package com.codegym.project.service;

import com.codegym.project.model.Product;
import com.codegym.project.model.TypeProduct;

import java.util.List;

public interface TypeProductService extends BaseService<TypeProduct> {
    List<TypeProduct> findAllTypeProductsDeleted();
}
