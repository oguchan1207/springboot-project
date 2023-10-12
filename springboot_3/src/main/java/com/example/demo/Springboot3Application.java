package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springboot3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3Application.class, args);
	}
    @GetMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "test") String name) {
      return String.format("test %s!", name);
    }
}
