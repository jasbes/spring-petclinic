package com.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author jsilva on 25/04/2020
 */
@Getter
@Setter
public class Pet {

    private PetType petType;

    private Owner owner;

    private LocalDate birthDay;
}
