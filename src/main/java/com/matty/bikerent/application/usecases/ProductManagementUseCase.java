package com.matty.bikerent.application.usecases;

import com.matty.bikerent.domain.Product;

public interface ProductManagementUseCase {
    Product createProduct(Product product);
}
