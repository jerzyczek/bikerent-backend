package com.matty.bikerent.domain;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import com.matty.bikerent.domain.vo.ProductId;
import com.matty.bikerent.domain.vo.ProductQuantity;

public class Product {
    private ProductId productId;
    private String name;
    private ProductQuantity productQuantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product() {
    }

    private Product(Builder builder) {
        productId = builder.productId;
        name = builder.name;
        productQuantity = builder.productQuantity;
        createdAt = builder.createdAt;
        updatedAt = builder.updatedAt;
    }

    public ProductId getProductId() {
        return this.productId;
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
        return Objects.equals(this.productId, product.productId) && Objects.equals(this.name, product.name) && Objects.equals(this.productQuantity, product.productQuantity) && Objects.equals(this.createdAt, product.createdAt) && Objects.equals(this.updatedAt, product.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.productId, this.name, this.productQuantity, this.createdAt, this.updatedAt);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productQuantity +
                ", name='" + name + '\'' +
                ", productQuantity=" + productQuantity +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


    public static final class Builder {
        private UUID uuid;
        private String name;
        private ProductQuantity productQuantity;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private ProductId productId;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder uuid(UUID val) {
            uuid = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder productQuantity(ProductQuantity val) {
            productQuantity = val;
            return this;
        }

        public Builder createdAt(LocalDateTime val) {
            createdAt = val;
            return this;
        }

        public Builder updatedAt(LocalDateTime val) {
            updatedAt = val;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

        public Builder productId(ProductId val) {
            productId = val;
            return this;
        }
    }
}
