package com.prova.exame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.prova")
@EntityScan(basePackages = {"com.prova.domains"})
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.prova.repositories")
public class ExameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExameApplication.class, args);
	}

}
