package com.example.Observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
		NewAgency newAgency= new NewAgency();

		Observer reader1 = new NewReader("Alice");
		Observer reader2 = new NewReader("reader2");

		newAgency.addObserver(reader1);
		newAgency.addObserver(reader2);

		newAgency.notifyObserver("Breaking news: Java rocks!");
	}

}
