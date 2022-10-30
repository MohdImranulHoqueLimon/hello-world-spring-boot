package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/home")
  public String home() {
    String str = "This is my home Germany, Frankfurt 11";
    System.out.println(str);
    return str;
  }
}
