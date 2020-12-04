package dev.codinghive.petclinic.data.services;

import dev.codinghive.petclinic.data.model.Pet;
import dev.codinghive.petclinic.data.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet,Long>{//<Vet,Long> going to map on java generics <T,ID>

}
