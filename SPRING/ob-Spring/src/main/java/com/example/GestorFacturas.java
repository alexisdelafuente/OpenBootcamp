package com.example;

import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    //Atributos
    Calculadora calculadora;


    //Constructores

    public GestorFacturas(Calculadora calculadora){
        System.out.println("Ejecutando Constructor de GestorFacturas");
        this.calculadora = calculadora;


    }
}
