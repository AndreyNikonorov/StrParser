package com.toyshop.strparser.service;

import com.toyshop.strparser.model.Catalog;
import com.toyshop.strparser.model.Category;
import com.toyshop.strparser.model.Product;

public interface StoreService {


    public String getCatalog();

    public String getProduct(String code);

    public String getCategory(String code);

}
