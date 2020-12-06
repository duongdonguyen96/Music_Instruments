package com.codegym.project.repository;

import com.codegym.project.model.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
}
