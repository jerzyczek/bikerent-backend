package com.matty.bikerent.domain;

public class ProductDomainException extends RuntimeException {
    public ProductDomainException(final String message) {
        super(message);
    }
}
