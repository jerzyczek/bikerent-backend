package com.matty.bikerent.domain;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import com.matty.bikerent.domain.vo.ProductQuantity;

public class Product {

    private UUID uuid;
    private String name;
    private ProductQuantity productQuantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product() {
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public ProductQuantity getProductQuantity() {
        return this.productQuantity;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Product product = (Product) o;
        return Objects.equals(this.uuid, product.uuid) && Objects.equals(this.name, product.name) && Objects.equals(this.productQuantity, product.productQuantity) && Objects.equals(this.createdAt, product.createdAt) && Objects.equals(this.updatedAt, product.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.uuid, this.name, this.productQuantity, this.createdAt, this.updatedAt);
    }
}
