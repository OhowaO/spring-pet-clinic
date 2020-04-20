package com.asperger.springpetclinic.service;

import com.asperger.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Set<Vet> findByLastName(String lastName);


}
