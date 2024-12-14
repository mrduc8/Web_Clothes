package com.poly.Repository;


import com.poly.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query ("select c from  Product c  where  c.name  LIKE %?1% ")
    List<Product> searchProduct(String keyword);
}
