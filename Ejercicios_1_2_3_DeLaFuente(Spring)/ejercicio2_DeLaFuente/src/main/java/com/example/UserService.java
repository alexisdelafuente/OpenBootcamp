package com.example;


import org.springframework.stereotype.Component;

@Component ("userService")
public class UserService {
     NotificationService ImprimirSaludo;

    public UserService (NotificationService ImprimirSaludo){
        this.ImprimirSaludo = ImprimirSaludo;
    }

}
