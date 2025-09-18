package com.myproject.InventoryMgtSystem.services;

import com.myproject.InventoryMgtSystem.dtos.LoginRequest;
import com.myproject.InventoryMgtSystem.dtos.RegisterRequest;
import com.myproject.InventoryMgtSystem.dtos.Response;
import com.myproject.InventoryMgtSystem.dtos.UserDTO;
import com.myproject.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
