package dev.codinghive.petclinic.data.services;

import dev.codinghive.petclinic.data.model.Pet;
import dev.codinghive.petclinic.data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
