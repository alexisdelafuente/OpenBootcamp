package com.deprueba.Interfaces;

import com.deprueba.Coche;

public class InterfacesMain {
    public static void main(String[] args) {

        //usamos la interfas para crear un objeto, uso parecido al poliformismo
        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2= new CocheServiceSportImpl();

        Coche coche1 = service1.CrearCocheDemo();
        Coche coche2 = service2.CrearCocheDemo();


    }
}
