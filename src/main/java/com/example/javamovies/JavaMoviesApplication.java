package com.example.javamovies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaMoviesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMoviesApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CharacterRepository characterRepository) {
        return args -> {
            Character testCharacter = new Character("Trunte", "Doggo","Female", "NOt-actually-a-url");
            characterRepository.save(testCharacter);
        };
    }
}
