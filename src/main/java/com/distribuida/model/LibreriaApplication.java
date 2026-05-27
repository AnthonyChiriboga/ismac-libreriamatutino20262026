package com.distribuida.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
		System.out.println("HOLA MUNDO DESDE SPRING BOOT...!!");


		Cliente cliente = new Cliente(
				1
				,"1726323234"
				,"Alan"
				,"Brito"
				,"Quito"
				,"0983456256"
				,"abrito@correo.com"



		);



	}

}
