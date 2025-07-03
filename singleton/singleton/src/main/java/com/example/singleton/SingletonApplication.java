package com.example.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);

		Singleton s1 = Singleton.getInstancia();
		Singleton s2 = Singleton.getInstancia();

		s1.mostrarMensaje();

		System.out.println("¿s1 y s2 son la misma instancia?" + (s1 == s2));
	}

}
