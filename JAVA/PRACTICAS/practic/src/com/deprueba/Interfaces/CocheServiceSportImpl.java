package com.deprueba.Interfaces;

import com.deprueba.Coche;
import com.deprueba.Interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche CrearCocheDemo() {
        System.out.println("Creando coche deportivo");
        System.out.println("En un momento estara listo.!");
        return new Coche();
    }

    @Override //palabra que colocada por el lenguaje Java
    public void DestruirCoche(Coche coche) {
        System.out.println("Destruyendo coche antiguo");
    }
}
