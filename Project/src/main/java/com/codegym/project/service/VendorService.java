package com.codegym.project.service;

import com.codegym.project.model.Product;
import com.codegym.project.model.Vendor;

import java.util.List;

public interface VendorService extends BaseService<Vendor> {
    List<Vendor> findAllVendorsDeleted();
}
