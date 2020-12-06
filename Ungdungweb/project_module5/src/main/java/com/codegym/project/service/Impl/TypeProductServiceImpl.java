package com.codegym.project.service.Impl;

import com.codegym.project.model.TypeProduct;
import com.codegym.project.repository.TypeProductRepository;
import com.codegym.project.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TypeProductServiceImpl implements TypeProductService {
    @Autowired
    TypeProductRepository typeProductRepository;
    @Override
    public List<TypeProduct> findAll() {
        return typeProductRepository.findAll();
    }

    @Override
    public TypeProduct findById(long id) throws SQLException {
        return null;
    }

    @Override
    public TypeProduct save(TypeProduct element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(long id) throws SQLException {
        return false;
    }
}
