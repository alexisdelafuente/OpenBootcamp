package com.example.ejercicios_Tema_6_DeLaFuente;

import com.example.ejercicios_Tema_6_DeLaFuente.entities.Laptop;
import com.example.ejercicios_Tema_6_DeLaFuente.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciosTema6DeLaFuenteApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjerciciosTema6DeLaFuenteApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"HP","H23G3",8,512);
		Laptop laptop2 = new Laptop(null,"Lenovo","NA14300",4,256);
		Laptop laptop3 = new Laptop(null,"Samsung","SMG80900",12,512);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);

		System.out.println("la cantidad de Laptops es: "+repository.findAll().size());
	}

}
