package com.timewise.main.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.timewise.main.Domain.Customer;
import com.timewise.main.Repository.CustomerRepository;

@RestController
public class NewsController {
  private final CustomerRepository repo;

  @GetMapping("/news")
  Iterable<Customer> newsHello() {
    return repo.findAll();
  }

  @PostMapping("/news")
  public String postMethod() {
    return "String";
  }

}