package com.deprueba;

public class CocheMain {
    public static void main(String[] args) {
        Coche cocheob = new Coche("verde,","Ford,","Sedan",3.234d,0);
        cocheob.acelerar(40);
        //System.out.println(cocheob);

        CocheElectric cocheElectrico = new CocheElectric ("34AFDAF43");
        cocheElectrico.color="azul";
        cocheElectrico.fabricante="Toyota";
        cocheElectrico.modelo="Coupe";
        cocheElectrico.peso= 2.434d;
        cocheElectrico.velocidad=0;

        System.out.println(cocheElectrico);

        CocheElectric cocheElectric2 = new CocheElectric("amarillo","Peugeot","Sedan",2.344d,0,"FS44FSF");

        System.out.println(cocheElectric2);
        cocheElectric2.acelerar(20);
        System.out.println(cocheElectric2);
    }
}
