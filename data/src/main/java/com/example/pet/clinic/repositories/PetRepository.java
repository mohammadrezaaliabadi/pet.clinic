package com.example.pet.clinic.repositories;

import com.example.pet.clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
