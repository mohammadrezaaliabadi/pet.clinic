package com.example.pet.clinic.repositories;

import com.example.pet.clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
