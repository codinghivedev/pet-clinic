package dev.codinghive.petclinic.data.services;

import java.util.Set;

public interface CrudService<T,ID> { //<T,ID> these are java generics

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
