package com.dio.usandofeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Usandofeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Usandofeign2Application.class, args);
	}

}
