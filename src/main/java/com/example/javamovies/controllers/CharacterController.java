package com.example.javamovies.controllers;

import com.example.javamovies.models.Character;
import com.example.javamovies.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository){
        this.characterRepository=characterRepository;
    }

    @GetMapping(path="test")
    public ResponseEntity<Character>getCharacterByID(){
        Character characters=characterRepository.getCharacterById(1L);
        HttpStatus resp=HttpStatus.OK;
        return new ResponseEntity<>(characters, resp);
    }
}
