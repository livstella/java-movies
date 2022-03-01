package com.example.javamovies.repositories;

import com.example.javamovies.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    Character getCharacterById(Long id);



}
