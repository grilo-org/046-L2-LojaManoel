package com.loja.empacotamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public String home() {
        return "✅ API Empacotamento no ar - Railway";
    }
}