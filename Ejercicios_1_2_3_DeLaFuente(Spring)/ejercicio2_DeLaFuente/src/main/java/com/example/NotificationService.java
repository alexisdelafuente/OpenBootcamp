package com.example;

import org.springframework.stereotype.Component;

@Component("notificacionService") //debido a que no scanea la clase, se coloco el nombre en el componente
public class NotificationService {

    public String Saludar() {
        return "hola, nos encontramos realizando el ejercicio 2";
    }

}


