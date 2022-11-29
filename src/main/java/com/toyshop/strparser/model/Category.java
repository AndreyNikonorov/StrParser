package com.toyshop.strparser.model;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private String code;

    public String printCategory() {
        return ("this is category - " + code);
    }
}
