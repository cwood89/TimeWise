package com.timewise.main.Repository;

import java.util.List;

import com.timewise.main.Domain.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
  List<Customer> findByLastName(String lastName);
}