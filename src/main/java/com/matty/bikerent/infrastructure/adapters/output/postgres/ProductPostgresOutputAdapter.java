package com.matty.bikerent.infrastructure.adapters.output.postgres;

import java.util.Optional;
import java.util.UUID;

import com.matty.bikerent.application.ports.output.ProductRepository;
import com.matty.bikerent.domain.Product;
import com.matty.bikerent.domain.ProductDomainException;
import com.matty.bikerent.infrastructure.adapters.output.postgres.data.ProductData;
import com.matty.bikerent.infrastructure.adapters.output.postgres.mappers.ProductPostgresMapper;
import org.springframework.stereotype.Repository;

@Repository
class ProductPostgresOutputAdapter implements ProductRepository {

    private ProductSpringJpaRepository productSpringJpaRepository;

    public ProductPostgresOutputAdapter(final ProductSpringJpaRepository productSpringJpaRepository) {
        this.productSpringJpaRepository = productSpringJpaRepository;
    }

    @Override
    public Optional<Product> findById(UUID productId) {
        return null;
    }

    @Override
    public Optional<Product> findByName(String name) {
        Optional<ProductData> productData = this.productSpringJpaRepository.findByName(name);
        return productData.map(ProductPostgresMapper::productDataToProduct);
    }

    @Override
    public void save(Product product) {
        ProductData productData = ProductPostgresMapper.productToProductData(product);
        this.productSpringJpaRepository.save(productData);
    }
}
