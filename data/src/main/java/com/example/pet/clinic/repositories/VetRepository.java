package com.example.pet.clinic.repositories;

import com.example.pet.clinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
