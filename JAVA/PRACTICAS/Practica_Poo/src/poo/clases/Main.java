package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        //1. CLASES Y OBJETOS
        Motor motorGTI = new Motor("Spor DSX32s",330,4);

        Vehiculo toyotoPrius = new Vehiculo();

        Vehiculo fordMondeo = new Vehiculo("Ford","Mondeo",2.1,2010,false,0,motorGTI);

        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.cc);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.sport);
        System.out.println(fordMondeo.speed);

        fordMondeo.Acelerar(50);

        System.out.println(fordMondeo.speed);


        //2. HERENCIA

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante="kawasaki";

        System.out.println("finaliza el programa");

        //3. POLIMORFISMO
        //se crea el obtejo a traves se de la clase padre y se las aplica con las clases hijas
        Vehiculo vehiculo;

        vehiculo = new Camion();
        vehiculo.Acelerar(50);

        vehiculo=new Motocicleta();
        vehiculo.Acelerar(100);

        vehiculo=new Coche();
        vehiculo.Acelerar(50);

    }
}
