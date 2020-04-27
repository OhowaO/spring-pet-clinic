package com.asperger.springpetclinic.service.map;

import com.asperger.springpetclinic.model.Vet;
import com.asperger.springpetclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Profile({"map", "default"})
public class VetServiceIImplMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findByLastName(String lastName) {
        return super.map.entrySet().stream()
                .filter(
                        longVetEntry -> longVetEntry.getValue().getLastName().equals(lastName))
                .map(Map.Entry::getValue)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
