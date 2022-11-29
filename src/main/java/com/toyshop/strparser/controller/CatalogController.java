package com.toyshop.strparser.controller;

import com.toyshop.strparser.model.Catalog;
import com.toyshop.strparser.service.StoreServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    private final StoreServiceImpl storeService;

    public CatalogController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/catalog/")
    Catalog getCatalog(){
        return storeService.getCatalog();
    }
}
