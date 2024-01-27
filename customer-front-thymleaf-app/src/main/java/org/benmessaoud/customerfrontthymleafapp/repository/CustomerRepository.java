package org.benmessaoud.customerfrontthymleafapp.repository;

import org.benmessaoud.customerfrontthymleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
