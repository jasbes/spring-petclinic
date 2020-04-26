package com.spring.petclinic.services;

import com.spring.petclinic.model.Vet;

import java.util.Set;

/**
 * @author jsilva on 26/04/2020
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
