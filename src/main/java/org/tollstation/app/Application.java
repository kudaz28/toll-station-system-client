package org.tollstation.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "org.tollstation.controller", "org.tollstation.app" }) 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
