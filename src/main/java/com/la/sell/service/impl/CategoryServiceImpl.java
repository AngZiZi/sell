package com.la.sell.service.impl;

import com.la.sell.dataObject.ProductCategory;
import com.la.sell.repository.ProductCategoryRepository;
import com.la.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    public CategoryServiceImpl() {
        super();
    }

    @Override
    public ProductCategory finOne(Integer catetoryId) {
        return repository.findOne(catetoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
