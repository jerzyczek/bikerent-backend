package com.matty.bikerent.application.ports.input;

import java.util.Optional;

import com.matty.bikerent.application.ports.output.ProductRepository;
import com.matty.bikerent.application.usecases.ProductManagementUseCase;
import com.matty.bikerent.domain.Product;
import com.matty.bikerent.domain.ProductDomainException;
import org.springframework.stereotype.Component;

@Component
public class ProductManagementInputPort implements ProductManagementUseCase {

    private ProductRepository productRepository;

    public ProductManagementInputPort(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(final Product product) {
        checkIfProductExist(product.getName());
        this.productRepository.save(product);
        return new Product();
    }

    private void checkIfProductExist(final String name) {
        Optional<Product> product = this.productRepository.findByName(name);
        if (product.isPresent()) {
            throw new ProductDomainException("Product with name: "+name+" exist");
        }
    }
}
