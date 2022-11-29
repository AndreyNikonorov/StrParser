package com.toyshop.strparser.controller;

import com.toyshop.strparser.model.Category;
import com.toyshop.strparser.model.Product;
import com.toyshop.strparser.service.StoreServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final StoreServiceImpl storeService;

    public ProductController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/catalog/toys/lego-set/{code}")
    Product getProduct(@PathVariable("code") String code) {
        return storeService.getProduct(code);
    }

}
