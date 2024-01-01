package com.example.petsCrud.repositories;

import com.example.petsCrud.models.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<PetModel, Long> {
}
