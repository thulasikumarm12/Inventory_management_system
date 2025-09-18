package com.myproject.InventoryMgtSystem.services;

import org.springframework.web.multipart.MultipartFile;

import com.myproject.InventoryMgtSystem.dtos.ProductDTO;
import com.myproject.InventoryMgtSystem.dtos.Response;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response getAllProducts();

    Response getProductById(Long id);

    Response deleteProduct(Long id);

    Response searchProduct(String input);
}
