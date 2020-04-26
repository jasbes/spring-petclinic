package com.spring.petclinic.services;

import com.spring.petclinic.model.Pet;

import java.util.Set;

/**
 * @author jsilva on 26/04/2020
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
