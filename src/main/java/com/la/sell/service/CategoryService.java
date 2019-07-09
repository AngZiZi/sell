package com.la.sell.service;

import com.la.sell.dataObject.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory finOne(Integer catetoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
