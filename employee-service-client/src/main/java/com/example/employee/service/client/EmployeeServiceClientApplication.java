package com.example.employee.service.client;

import com.example.employee.service.api.EmployeeApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceClientApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EmployeeApi client) {
		return args -> {
			client.getEmployees().getBody().forEach(System.out::println);
		};
	}
}
