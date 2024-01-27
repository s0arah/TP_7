package org.benmessaoud.inventoryservice.inventoryservice.web;

import org.benmessaoud.inventoryservice.inventoryservice.entities.Product;
import org.benmessaoud.inventoryservice.inventoryservice.repositories.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> products(){
        return productRepository.findAll();
    }
}
