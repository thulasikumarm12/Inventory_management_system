package com.myproject.InventoryMgtSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.InventoryMgtSystem.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
