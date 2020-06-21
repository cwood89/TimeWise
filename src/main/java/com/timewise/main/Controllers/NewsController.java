package com.timewise.main.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timewise.main.Domain.Customer;
import com.timewise.main.Repository.CustomerRepository;

@RestController
public class NewsController {
  private CustomerRepository repo;

  @GetMapping("/news")
  public Iterable<Customer> newsHello() {
    Iterable<Customer> customer = repo.findAll();
    return customer;
  }

  @PostMapping("/news")
  public String postMethod() {

    return "String";
  }

}