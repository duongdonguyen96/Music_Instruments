package com.codegym.project.repository;

import com.codegym.project.model.Product;
import com.codegym.project.model.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
    @Query(
            value = "SELECT * FROM type_product u WHERE u.delete = true",
            nativeQuery = true)
    List<TypeProduct> findAllTypeProductsDeleted();
}
