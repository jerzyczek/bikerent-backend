package com.matty.bikerent.infrastructure.adapters.output.postgres.mappers;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import com.matty.bikerent.domain.Product;
import com.matty.bikerent.domain.vo.ProductQuantity;
import com.matty.bikerent.infrastructure.adapters.output.postgres.data.ProductData;

public class ProductPostgresMapper {

    public static ProductData productToProductData(final Product product) {
        if (Objects.isNull(product.getCreatedAt())) {
            return buildDataWithTimestamps(product);
        }
        return buildDataWithoutTimestamps(product);
    }

    public static Product productDataToProduct(ProductData productData) {
        return Product.Builder.builder()
                .uuid(productData.getProductId())
                .name(productData.getName())
                .productQuantity(new ProductQuantity(productData.getProductQuantity()))
                .createdAt(productData.getCreatedAt())
                .updatedAt(productData.getUpdatedAt())
                .build();
    }

    private static ProductData buildDataWithTimestamps(final Product product) {
        return ProductData.builder()
                .productId(UUID.randomUUID())
                .name(product.getName())
                .productQuantity(product.getProductQuantity().value())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    private static ProductData buildDataWithoutTimestamps(final Product product) {
        return ProductData.builder()
                .productId(product.getProductId().value())
                .name(product.getName())
                .productQuantity(product.getProductQuantity().value())
                .updatedAt(LocalDateTime.now())
                .build();
    }

}
