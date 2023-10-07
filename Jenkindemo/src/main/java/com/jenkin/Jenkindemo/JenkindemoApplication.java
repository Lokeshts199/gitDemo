package com.jenkin.Jenkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.jenkin.jenkineApiGenerator"})
public class JenkindemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkindemoApplication.class, args);
	}

}
