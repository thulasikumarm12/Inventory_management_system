package com.myproject.InventoryMgtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.InventoryMgtSystem.models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
