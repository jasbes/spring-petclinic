package com.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author jsilva on 26/04/2020
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    private Long id;
}
