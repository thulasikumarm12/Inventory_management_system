package com.myproject.InventoryMgtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.InventoryMgtSystem.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}
