package com.matty.bikerent.infrastructure.adapters.input.rest.mapper;

import java.util.UUID;

import com.matty.bikerent.domain.Product;
import com.matty.bikerent.domain.vo.ProductQuantity;
import com.matty.bikerent.infrastructure.adapters.input.rest.post.dto.ProductRequest;

public class ProductMapper {

    public static Product productRequestToProduct(final ProductRequest productRequest) {
        return Product.Builder.builder()
                .uuid(UUID.randomUUID())
                .name(productRequest.name())
                .productQuantity(new ProductQuantity(productRequest.quantity()))
                .build();
    }

}
