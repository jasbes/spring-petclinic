package com.spring.petclinic.services;

import java.util.Set;

/**
 * @author jsilva on 26/04/2020
 */
public interface CrudService <T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
