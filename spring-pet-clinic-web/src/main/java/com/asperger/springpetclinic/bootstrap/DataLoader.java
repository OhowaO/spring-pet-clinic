package com.asperger.springpetclinic.bootstrap;

import com.asperger.springpetclinic.model.Owner;
import com.asperger.springpetclinic.model.Vet;
import com.asperger.springpetclinic.service.OwnerService;
import com.asperger.springpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("jane");
        owner1.setLastName("kinuthia");
        ownerService.save(owner1);

        Vet vet1 = new Vet();
        vet1.setFirstName("Milton");
        vet1.setLastName("Orieda");
        vetService.save(vet1);
    }
}
