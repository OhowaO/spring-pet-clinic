package com.asperger.springpetclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T save(ID id, T object);

    T findById(ID id);

    void delete(T object);

    void deleteById(ID id);
}