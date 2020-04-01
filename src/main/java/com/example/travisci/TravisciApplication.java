package com.example.travisci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravisciApplication {

	public static void main(String[] args) {
		//testing for bugs
		SpringApplication.run(TravisciApplication.class, args);
	}
public void message() {
	System.out.println("adding a line to travis-ci");
}
}
