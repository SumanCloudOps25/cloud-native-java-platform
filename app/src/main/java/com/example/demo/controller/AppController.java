package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Cloud Native Java App Running!";
    }

    @GetMapping("/version")
    public String version() {
        return "v1";
    }

    @GetMapping("/health")
    public String health() {
        return "Application Healthy";
    }
}