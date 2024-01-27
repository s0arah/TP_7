package org.benmessaoud.inventoryservice.inventoryservice.repositories;

import org.benmessaoud.inventoryservice.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
