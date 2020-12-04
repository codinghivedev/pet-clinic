package dev.codinghive.petclinic.data.services;

import dev.codinghive.petclinic.data.model.Owner;
import dev.codinghive.petclinic.data.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet,Long>{//<Pet,Long> going to map on java generics <T,ID>

}
