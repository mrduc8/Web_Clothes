package com.poly.service;

import com.poly.entity.Product;

import java.util.List;

public interface searchProductService {
    List<Product> searchProduct(String keyword);
}
