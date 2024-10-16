package com.school.ExamCardsApp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ExamCardsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamCardsAppApplication.class, args);
	}

}
