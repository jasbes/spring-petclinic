package com.spring.petclinic.services;

import com.spring.petclinic.model.Owner;

import java.util.List;

/**
 * @author jsilva on 26/04/2020
 */
public interface OwnerService extends CrudService <Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
