package com.la.service_b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/mensaje")
    public String serviceB() {
        return "Respuesta desde Service B";
    }
}
