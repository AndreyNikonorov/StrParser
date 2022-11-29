package com.toyshop.strparser.model;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private String code;
    public String prinCategory(){
        return ("this is category - " + code);
    }
}
