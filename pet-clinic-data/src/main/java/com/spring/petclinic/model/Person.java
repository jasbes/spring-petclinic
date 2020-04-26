package com.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jsilva on 25/04/2020
 */
@Getter
@Setter
public class Person extends BaseEntity {

    private String firstName;

    private String lastName;
}
