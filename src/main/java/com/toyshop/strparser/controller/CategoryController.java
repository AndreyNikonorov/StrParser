package com.toyshop.strparser.controller;

import com.toyshop.strparser.model.Category;
import com.toyshop.strparser.service.StoreServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    private final StoreServiceImpl storeService;

    public CategoryController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/catalog/toys/{code}")
    Category getCategory(@PathVariable("code") String code) {
        return storeService.getCategory(code);
    }
}
