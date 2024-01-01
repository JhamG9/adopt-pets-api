package com.example.petsCrud;

import com.example.petsCrud.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(WebConfig.class)
public class PetsCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetsCrudApplication.class, args);
	}

}
