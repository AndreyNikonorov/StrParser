package com.toyshop.strparser.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String code;

    public String printProduct() {
        return ("this is product - " + code);
    }
}
