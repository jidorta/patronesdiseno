package com.example.Adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterApplication.class, args);
		PaypalApi api = new PaypalApi();
		ProcesadorPagos procesador = new PaypalAdapter(api);
		procesador.procesarPago(100.0);
	}

}
