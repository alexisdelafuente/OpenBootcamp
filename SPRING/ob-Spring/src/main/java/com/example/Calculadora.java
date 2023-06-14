package com.example;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public Calculadora (){
        System.out.println("Ejecutando constructor de calculadora");
    }

    public String holaMundo (){
        return "hola mundo";
    }
}
