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
public class Owner extends Person {

    private String address;

    private String city;

    private String telephone;

    private Set<Pet> pets = new HashSet<>();
}
