package com.toyshop.strparser.service;

import com.toyshop.strparser.model.Catalog;
import com.toyshop.strparser.model.Category;
import com.toyshop.strparser.model.Product;

public interface StoreService {


    public Catalog getCatalog();

    public Product getProduct(String code);

    public Category getCategory(String code);

}
