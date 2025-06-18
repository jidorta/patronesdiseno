package com.example.company;

import com.example.company.creational.factorymethod.Payment;
import com.example.company.creational.factorymethod.PaymentFactory;
import com.example.company.creational.factorymethod.TypePayment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {

		SpringApplication.run(FactoryMethodApplication.class, args);
		probarFactoryMethod();
	}

	private static void probarFactoryMethod(){
		Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY );
		payment.doPayment();
	}

}
