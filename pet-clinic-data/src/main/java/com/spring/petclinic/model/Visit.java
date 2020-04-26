package com.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author jsilva on 26/04/2020
 */
@Getter
@Setter
public class Visit extends BaseEntity {

    private LocalDate date;

    private String description;

    private Pet pet;
}
