package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calbudget {
    public static void main(String[] args) {
        SpringApplication.run(Calbudget.class, args);
        System.out.println(" Calbudget Application Started Successfully!");
        System.out.println("Server running on: http://localhost:8080");
        System.out.println("H2 Database Console: http://localhost:8080/h2-console");
        System.out.println(" JDBC URL: jdbc:h2:mem:testdb");
        System.out.println("Username: sa");
        System.out.println("Password: (leave empty)");
    }
}