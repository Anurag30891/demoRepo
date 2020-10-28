package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public void addData(String data) {
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome");
		}
	}
	
	public void addedMethod(){
		System.out.println("new method")
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
