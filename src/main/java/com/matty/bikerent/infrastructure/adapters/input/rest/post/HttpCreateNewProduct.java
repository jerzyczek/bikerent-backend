package com.matty.bikerent.infrastructure.adapters.input.rest.post;

import com.matty.bikerent.infrastructure.adapters.input.rest.post.dto.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
class HttpCreateNewProduct {

    @PostMapping
    public ResponseEntity<?> execute(@RequestBody ProductRequest productRequest) {
        return null;
    }

}
