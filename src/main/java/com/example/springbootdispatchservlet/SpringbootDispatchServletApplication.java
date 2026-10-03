package com.example.springbootdispatchservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class SpringbootDispatchServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDispatchServletApplication.class, args);
    }

}
