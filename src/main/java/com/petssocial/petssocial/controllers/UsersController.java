package com.petssocial.petssocial.controllers;

import com.petssocial.petssocial.repositories.UsersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    @GetMapping
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(this.usersRepository.findAll());
    }
}
