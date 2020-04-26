package com.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jsilva on 25/04/2020
 */
@Getter
@Setter
public class Pet extends BaseEntity {

    private String name;

    private PetType petType;

    private Owner owner;

    private LocalDate birthDate;

    private Set<Visit> visits = new HashSet<>();
}
