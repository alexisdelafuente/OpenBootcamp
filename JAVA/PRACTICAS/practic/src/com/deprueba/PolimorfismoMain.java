package com.deprueba;

import java.util.ArrayList;
import java.util.List;

public class PolimorfismoMain {
    public static void main(String[] args) {
        CocheElectric coche1 = new CocheElectric();
        CocheHibrido coche2 = new CocheHibrido();

        //POLIMORFISMO

        Coche coche3 = new CocheElectric(); //ceamos un objeto usando la clase padre e hija
        Coche coche4 = new CocheHibrido();

        if (coche3 instanceof CocheElectric){ //instanceof sirve para compara si coche3 pertene a CocheElectric
            System.out.println("este es un coche electrico");
            coche3.color="Blanco";
            coche3.fabricante="Q";
            coche3.modelo="Coupe";
            coche3.velocidad=0;
            coche3.peso=1.344d;
            ((CocheElectric) coche3).tipoMotorElec="ER32FX";

            System.out.println(coche3);
        }
        if (coche4 instanceof CocheHibrido){
            System.out.println("este es un coche hibrido");


        }
    }
}
