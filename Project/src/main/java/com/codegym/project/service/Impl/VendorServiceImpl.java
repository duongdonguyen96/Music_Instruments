package com.codegym.project.service.Impl;

import com.codegym.project.model.Product;
import com.codegym.project.model.Vendor;
import com.codegym.project.repository.ProductRepository;
import com.codegym.project.repository.VendorRepository;
import com.codegym.project.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {
    @Autowired
    VendorRepository vendorRepository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Vendor> findAll() {
        return vendorRepository.findAll();
    }

    @Override
    public Vendor findById(long id) throws SQLException {
        return vendorRepository.findById(id).orElse(null);
    }

    @Override
    public Vendor save(Vendor vendor) throws SQLException {
        return vendorRepository.save(vendor);
    }

    @Override
    public boolean delete(long id) throws SQLException {
        Vendor vendor=this.findById(id);
        if (vendor==null){
            return false;
        }
        vendor.setDelete(true);
        vendor.setDateDelete(new Date());
        vendorRepository.save(vendor);
        List<Product> productList=productRepository.findAll();
        for (Product product:productList) {
            if (product.getVendor().isDelete()){
                product.setDelete(true);
                product.setDateDelete(new Date());
                productRepository.save(product);
            }
        }
        return true;
    }

    @Override
    public List<Vendor> findAllVendorsDeleted() {
        return vendorRepository.findAllVendorsDeleted();
    }
}
