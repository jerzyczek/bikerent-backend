package com.matty.bikerent.infrastructure.adapters.input.rest.post;

import com.matty.bikerent.application.usecases.ProductManagementUseCase;
import com.matty.bikerent.domain.Product;
import com.matty.bikerent.infrastructure.adapters.input.rest.mapper.ProductMapper;
import com.matty.bikerent.infrastructure.adapters.input.rest.post.dto.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
class HttpCreateNewProduct {

    private ProductManagementUseCase productManagementUseCase;

    public HttpCreateNewProduct(final ProductManagementUseCase productManagementUseCase) {
        this.productManagementUseCase = productManagementUseCase;
    }

    @PostMapping
    public ResponseEntity<?> execute(@RequestBody ProductRequest productRequest) {
        Product product = ProductMapper.productRequestToProduct(productRequest);
        this.productManagementUseCase.createProduct(product);
        return null;
    }

}
