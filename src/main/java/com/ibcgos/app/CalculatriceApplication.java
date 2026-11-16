package com.ibcgos.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatriceApplication.class, args);
		Calculatrice calculatrice = new Calculatrice();
		System.out.println(calculatrice.somme(10, 20));
		System.out.println(calculatrice.multiplication(10, 20));
	}

}
