package com.clairvoyant.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.clairvoyant.mvc")
public class SpringBootCountryPocApplication {

	public static void main(String args[]) {
		SpringApplication.run(SpringBootCountryPocApplication.class, args);
	}
}
