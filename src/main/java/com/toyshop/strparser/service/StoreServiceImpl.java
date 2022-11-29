package com.toyshop.strparser.service;

import com.toyshop.strparser.model.Catalog;
import com.toyshop.strparser.model.Category;
import com.toyshop.strparser.model.Product;
import com.toyshop.strparser.repository.CategoryRepo;
import com.toyshop.strparser.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {
    private final Catalog catalog;
    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;

    public StoreServiceImpl(CategoryRepo categoryRepo, Catalog catalog, ProductRepo productRepo) {
        this.categoryRepo = categoryRepo;
        this.catalog = catalog;
        this.productRepo = productRepo;
    }


    @Override
    public Catalog getCatalog() {
        return this.catalog;
    }

    @Override
    public Product getProduct(String code) {
        return productRepo.getProduct(code);
    }

    @Override
    public Category getCategory(String code) {
        return categoryRepo.getCategory(code);
    }
}
