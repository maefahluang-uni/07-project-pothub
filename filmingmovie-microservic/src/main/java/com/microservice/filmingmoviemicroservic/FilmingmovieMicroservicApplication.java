package com.microservice.filmingmoviemicroservic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FilmingmovieMicroservicApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmingmovieMicroservicApplication.class, args);
	}

}
