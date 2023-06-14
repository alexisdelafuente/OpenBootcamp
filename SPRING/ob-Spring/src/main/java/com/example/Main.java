package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Calculadora calculadora = (com.example.Calculadora) context.getBean("calculadora");


        String texto = calculadora.holaMundo();
        System.out.println(texto);

        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        texto = calculadora2.holaMundo();
        System.out.println(texto);

        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());



    }
}
