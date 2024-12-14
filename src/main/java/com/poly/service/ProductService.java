package com.poly.service;

import java.util.List;

import com.poly.Repository.ProductRepository;
import com.poly.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

public interface ProductService {
	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);


	List<Product> searchProducts(String name);
}
