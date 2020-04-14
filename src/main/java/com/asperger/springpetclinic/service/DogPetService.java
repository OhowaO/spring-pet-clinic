package com.asperger.springpetclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DOG")
@Service("petService")
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dog";
    }
}
