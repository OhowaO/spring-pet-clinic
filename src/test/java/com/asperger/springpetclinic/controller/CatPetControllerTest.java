package com.asperger.springpetclinic.controller;

import com.asperger.springpetclinic.service.CatPetService;
import com.asperger.springpetclinic.service.PetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatPetControllerTest {

    private PetService petService;
    private PetController petController;

    @BeforeEach
    void setUp() {
        this.petService = new CatPetService();
        this.petController = new PetController(this.petService);
    }
    @Test
    void whichPetIsTheBest() {
        this.petController.whichPetIsTheBest().equals(this.petService.getPetType());
    }
}
