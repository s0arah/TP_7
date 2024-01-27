package org.benmessaoud.inventoryservice.inventoryservice;

import org.benmessaoud.inventoryservice.inventoryservice.entities.Product;
import org.benmessaoud.inventoryservice.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder()
							.id(UUID.randomUUID().toString())
							.name("computer")
							.price(4200)
							.Quantity(12)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("printer")
					.price(1400)
					.Quantity(2)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("phone")
					.price(3000)
					.Quantity(7)
					.build());
		};

	}

}
