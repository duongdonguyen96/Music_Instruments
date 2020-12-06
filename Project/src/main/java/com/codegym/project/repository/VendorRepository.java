package com.codegym.project.repository;

import com.codegym.project.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
