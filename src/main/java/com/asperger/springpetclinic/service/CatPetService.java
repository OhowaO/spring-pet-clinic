package com.asperger.springpetclinic.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"default", "CAT"})
@Service("petService")
public class CatPetService implements PetService{

    @Override
    public String getPetType() {
        return "Cat";
    }
}
