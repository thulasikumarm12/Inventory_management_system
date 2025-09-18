package com.myproject.InventoryMgtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.InventoryMgtSystem.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
