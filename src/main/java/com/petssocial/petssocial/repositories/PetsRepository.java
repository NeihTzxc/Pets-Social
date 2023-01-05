package com.petssocial.petssocial.repositories;

import com.petssocial.petssocial.models.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Long> {

}
