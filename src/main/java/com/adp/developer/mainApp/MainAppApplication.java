package com.adp.developer.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainAppApplication.class, args);
		System.out.println("Boot has started..");
	}
}
