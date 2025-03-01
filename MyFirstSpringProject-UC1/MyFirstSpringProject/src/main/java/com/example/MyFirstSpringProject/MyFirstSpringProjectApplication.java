package com.example.MyFirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringProjectApplication {

//	System.out.println("Hello!");
	public static void main(String[] args) {
		System.out.println("Hello!");
		SpringApplication.run(MyFirstSpringProjectApplication.class, args);
	}

}
