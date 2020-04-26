package com.spring.petclinic.services;

import com.spring.petclinic.model.Owner;

import java.util.Set;

/**
 * @author jsilva on 26/04/2020
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
