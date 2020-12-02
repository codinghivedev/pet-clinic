package dev.codinghive.petclinic.data.services;

import dev.codinghive.petclinic.data.model.Owner;
import dev.codinghive.petclinic.data.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
