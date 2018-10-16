package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@EntityScan(basePackages = "package com.example.demo.model")
@EnableJpaRepositories
@ComponentScan(basePackages = {"com.example.demo.service","com.example.demo.controller","com.example.demo.model"})*/
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
