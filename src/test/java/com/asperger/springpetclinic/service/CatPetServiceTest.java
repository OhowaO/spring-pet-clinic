package com.asperger.springpetclinic.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatPetServiceTest {

    private CatPetService catPetService;

    @BeforeEach
    void setUp() {
        this.catPetService = new CatPetService();
    }

    @Test
    void getPetTypeTest() {
        this.catPetService.getPetType().equals("Cat");
    }
}
