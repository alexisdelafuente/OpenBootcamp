package com.deprueba.Interfaces;

import com.deprueba.Coche;
import com.deprueba.CocheElectric;
import com.deprueba.Interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche CrearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectric();
    }

    @Override
    public void DestruirCoche(Coche coche) {
        System.out.println("Destruyendo coche antiguo");
    }
}

