package com.toyshop.strparser.repository;

import com.toyshop.strparser.model.Category;
import com.toyshop.strparser.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProductRepo {
    private Map<String, Product> productRepo;

    public Product getProduct(String code) {
        return productRepo.get(code);
    }
}
