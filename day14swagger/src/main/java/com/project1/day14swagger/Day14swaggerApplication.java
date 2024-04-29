package com.project1.day14swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info=@Info(
        title="App Title",
        version="1.1.2",
        description="AD",
        contact=@Contact(
            name="AN",
            email="AE"
        )
    )
)

@SpringBootApplication
public class Day14swaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day14swaggerApplication.class, args);
	}

}
