package com.project1.day13swaggerui;

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
public class Day13swaggeruiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day13swaggeruiApplication.class, args);
	}

}
