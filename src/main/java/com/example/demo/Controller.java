package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController

@RequestMapping("/api")

public class Controller {



    @GetMapping("/nombre")

    public String obtenerNombre() {

        return "Mi nombre es Camilo Cantillo";

    }

}