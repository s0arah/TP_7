package org.benmessaoud.customerfrontthymleafapp;

import org.benmessaoud.customerfrontthymleafapp.entities.Customer;
import org.benmessaoud.customerfrontthymleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("sara").email("ben@me.com").build());
            customerRepository.save(Customer.builder().name("meryem").email("mimi@me.com").build());
            customerRepository.save(Customer.builder().name("alaa").email("allaa@me.com").build());
        };
    }
}
