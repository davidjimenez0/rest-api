package com.springapi.example.restservice;

import model.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
		System.out.println("test");
		Greeting a = new Greeting(121,"a");
	}
	D:\git\rest-api\rest-service\rest-service\src\main\java\com\springapi\example\restservice\RestServiceApplication.java
}
