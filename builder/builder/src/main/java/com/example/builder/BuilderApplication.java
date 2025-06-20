package com.example.builder;

import com.example.builder.company.creational.builder.Pizza;
import com.example.builder.company.creational.builder.PizzaBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuilderApplication.class, args);

		Pizza pizza = new PizzaBuilder()
				.setMasa("fina")
				.setSalsa("tomate")
				.setRelleno("queso y jamon")
				.build();
		System.out.println( pizza);

	}

}
