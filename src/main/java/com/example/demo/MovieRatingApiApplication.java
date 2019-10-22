package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.RatingController;
import com.example.service.RatingService;

@SpringBootApplication
@ComponentScan(basePackageClasses=RatingController.class) // we are using @ComponentScan because packages are different and are not sub packages either
@ComponentScan(basePackageClasses=RatingService.class)
public class MovieRatingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingApiApplication.class, args);
	}

}
