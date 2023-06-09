package com.deprueba;

public class CocheElectric extends Coche{
    String tipoMotorElec;
    public CocheElectric(){}
    public CocheElectric(String tipoMotorElec){
        this.tipoMotorElec = tipoMotorElec;
    }
    public CocheElectric(String color, String fabricante, String modelo, double peso, int velocidad,String tipoMotorElec){
        super(color, fabricante, modelo, peso, velocidad);
        this.tipoMotorElec=tipoMotorElec;
    }

    @Override
    public void acelerar(int velocidad) {
        Integer ajusteVelovidad = velocidad * 2;
        super.acelerar(ajusteVelovidad);
    }

    @Override
    public String toString() {
        return "CocheElectric{" +
                "tipoMotorElec='" + tipoMotorElec + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}