package com.toyshop.strparser.controller;


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

    @GetMapping("/catalog/{categoryCode}/{productCode}")
    String getProduct(@PathVariable("categoryCode") String categoryCode,
                       @PathVariable("productCode") String productCode) {
        return storeService.getProduct(productCode);
    }

}
