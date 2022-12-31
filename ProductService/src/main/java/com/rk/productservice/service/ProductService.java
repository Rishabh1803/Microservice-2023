package com.rk.productservice.service;

import com.rk.productservice.dto.ProductRequest;
import com.rk.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
