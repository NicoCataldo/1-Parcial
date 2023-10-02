package com.example.demo;

import com.example.demo.Entities.Persona;
import com.example.demo.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiRestApplication {
	@Autowired
	PersonaRepository personaRepositorio;
	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
		System.out.println("Corriendo");
	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepositorio) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");
			Persona persona = Persona.builder()
					.nombre("Juan")
					.apellido("Pérez")
					.dni("42000456")
					.build();

			Persona persona2 = Persona.builder()
					.nombre("Nicolas")
					.apellido("Cataldo")
					.dni("22456853")
					.build();

			personaRepositorio.save(persona);
			personaRepositorio.save(persona2);

		};

	}
}
