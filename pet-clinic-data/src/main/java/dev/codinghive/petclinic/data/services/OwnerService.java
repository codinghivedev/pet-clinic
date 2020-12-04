package dev.codinghive.petclinic.data.services;

import dev.codinghive.petclinic.data.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{//<Owner,Long> going to map on java generics <T,ID>

    Owner findByLastName(String lastName);

}
