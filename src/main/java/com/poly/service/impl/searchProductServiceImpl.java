package com.poly.service.impl;


import com.poly.Repository.ProductRepository;
import com.poly.entity.Product;
import com.poly.service.searchProductService;

import java.util.List;

public class searchProductServiceImpl implements searchProductService {

    private com.poly.Repository.ProductRepository ProductRepository;

    @Override
    public List<Product> searchProduct(String keyword) {
        return this.ProductRepository.searchProduct(keyword);
    }
}
