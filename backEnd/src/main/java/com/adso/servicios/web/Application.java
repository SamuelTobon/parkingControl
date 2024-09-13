package com.adso.servicios.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = "com.adso.servicios.web")
// @EnableJpaRepositories(basePackages = "com.adso.servicios.web.Repositorios")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
