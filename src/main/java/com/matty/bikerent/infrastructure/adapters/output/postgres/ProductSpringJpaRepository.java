package com.matty.bikerent.infrastructure.adapters.output.postgres;

import java.util.Optional;
import java.util.UUID;

import com.matty.bikerent.domain.Product;
import com.matty.bikerent.infrastructure.adapters.output.postgres.data.ProductData;
import org.springframework.data.repository.CrudRepository;

interface ProductSpringJpaRepository extends CrudRepository<ProductData, UUID> {
    Optional<ProductData> findByName(String name);
}
