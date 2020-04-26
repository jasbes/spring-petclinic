package com.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jsilva on 25/04/2020
 */
@Getter
@Setter
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();
}
