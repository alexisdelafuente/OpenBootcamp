package com.example.ejercicio_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		Coche Peugeot = new Coche(null, "Negro", "208", 2019);
		Coche Chevrolet = new Coche(null, "blanco", "Corsa", 2021);
		Coche Peugeot1 = new Coche(null, "rojo", "4008", 2023);
		Coche Renault = new Coche(null, "Azul", "Clio", 2015);

		repository.save(Peugeot);
		repository.save(Peugeot1);
		repository.save(Chevrolet);
		repository.save(Renault);

		System.out.println("DETALLLES DE COCHES");
		//System.out.print(" | " + repository.findAll());

		for (Coche repo : repository.findAll()){
			System.out.println(" | " +repo+" | ");
		}
	}

}
