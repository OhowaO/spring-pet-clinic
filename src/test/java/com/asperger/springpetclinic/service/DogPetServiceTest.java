package com.asperger.springpetclinic.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DogPetServiceTest {

    private DogPetService dogPetService;

    @BeforeEach
    void setUp() {
        this.dogPetService = new DogPetService();
    }

    @Test
    void getPetTypeTest() {
        this.dogPetService.getPetType().equals("Dog");
    }
}
