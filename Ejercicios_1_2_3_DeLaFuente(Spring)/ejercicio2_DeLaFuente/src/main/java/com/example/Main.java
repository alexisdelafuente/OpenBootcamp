package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        NotificationService notificationService = (NotificationService) context.getBean("notificacionService");
        //String texto = notificationService.Saludar();
        //System.out.println(texto);

        UserService service = (UserService) context.getBean("userService");
        System.out.println(service.ImprimirSaludo.Saludar());

    }
}
