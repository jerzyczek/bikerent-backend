package com.matty.bikerent.application.ports.output;

import java.util.Optional;
import java.util.UUID;

import com.matty.bikerent.domain.Product;

public interface ProductRepository {

    Optional<Product> findById(UUID productId);
    Optional<Product> findByName(String name);
    void save(Product product);

}
