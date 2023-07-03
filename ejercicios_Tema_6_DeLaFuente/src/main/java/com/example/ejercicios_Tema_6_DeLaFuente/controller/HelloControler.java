package com.example.ejercicios_Tema_6_DeLaFuente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/saludo")
    public String saludo(){
        return "hola, estamos programando";
    }
}
