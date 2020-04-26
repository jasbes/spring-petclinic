package com.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jsilva on 27/04/2020
 */
@Controller
public class IndexController {

    @GetMapping(value = {"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
