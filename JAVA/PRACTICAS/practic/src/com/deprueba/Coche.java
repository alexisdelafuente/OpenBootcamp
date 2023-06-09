package com.deprueba;

public class Coche {
    //ATRIBUTOS
    String color;
    String fabricante;
    String modelo;
    double peso;
    int velocidad;

    //CONSTRUCTORES
    public Coche(){}
    public Coche(String color, String fabricante, String modelo, double peso, int velocidad){
        this.color=color;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.peso=peso;
        this.velocidad=velocidad;
    }
    //COMPORTAMIENTO

    public void acelerar(int velocidad){
        if (velocidad < 100){
            this.velocidad = velocidad + 100;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}
