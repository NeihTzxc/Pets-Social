package com.petssocial.petssocial.controllers;

import com.petssocial.petssocial.repositories.PetsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetsController {
    private final PetsRepository petsRepository;

    public PetsController(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }
    @GetMapping
    public ResponseEntity getAllPets() {
        return ResponseEntity.ok(this.petsRepository.findAll());
    }
}
