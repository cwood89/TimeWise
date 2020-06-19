package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
  @GetMapping("/news")
  public String newsHello() {
    return "Here's the news.";
  }

  @PostMapping("/news")
  public String postMethod() {
    return "String";
  }

}