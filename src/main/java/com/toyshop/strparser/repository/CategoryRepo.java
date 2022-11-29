package com.toyshop.strparser.repository;

import com.toyshop.strparser.model.Category;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CategoryRepo {
    private Map<String,Category> categoryRepo;
    public Category getCategory(String code){
        return categoryRepo.get(code);
    }
}
