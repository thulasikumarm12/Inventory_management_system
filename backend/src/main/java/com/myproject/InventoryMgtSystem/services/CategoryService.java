package com.myproject.InventoryMgtSystem.services;

import com.myproject.InventoryMgtSystem.dtos.CategoryDTO;
import com.myproject.InventoryMgtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
