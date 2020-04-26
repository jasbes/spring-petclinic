package com.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jsilva on 27/04/2020
 */
@Controller
public class VetsController {

    @GetMapping(value = {"vets", "vets/index", "vets/index.html"})
    public String index() {
        return "vets/index";
    }
}
