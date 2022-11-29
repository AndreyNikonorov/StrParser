package com.toyshop.strparser.service;

import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {


    @Override
    public String getCatalog() {
        return "catalog";
    }

    @Override
    public String getProduct(String code) {
        return "Product" + code;
    }

    @Override
    public String getCategory(String code) {
        return "Category" + code;
    }
}
