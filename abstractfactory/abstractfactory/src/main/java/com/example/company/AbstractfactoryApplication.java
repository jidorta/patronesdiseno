package com.example.company;

import com.example.company.creational.abstractfactory.AbstractFactory;
import com.example.company.creational.abstractfactory.Card;
import com.example.company.creational.abstractfactory.FactoryProvider;
import com.example.company.creational.abstractfactory.PaymentMethod;
import com.example.company.creational.factorymethod.Payment;
import com.example.company.creational.factorymethod.PaymentFactory;
import com.example.company.creational.factorymethod.TypePayment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractfactoryApplication {

	public static void main(String[] args) {

		SpringApplication.run(AbstractfactoryApplication.class, args);
		//probarFactoryMethod();
		probarAbstractFactory();
	}

	private static void probarFactoryMethod(){
		Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
		payment.doPayment();
	}

	private static void probarAbstractFactory(){
		AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
		Card tarjeta = (Card) abstractFactory.create("VISA");

		AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
		PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");

		System.out.println("Una tarjeta de tipo: " + tarjeta.getCardType() + " con el método de pago" +  paymentMethod.doPayment());

	}

}
