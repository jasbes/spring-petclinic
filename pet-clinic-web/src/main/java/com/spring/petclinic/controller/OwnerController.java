package com.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jsilva on 27/04/2020
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @GetMapping(value = {"", "index", "index.html"})
    public String index() {
        return "owners/index";
    }
}
