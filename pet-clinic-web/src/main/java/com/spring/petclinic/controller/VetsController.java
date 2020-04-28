package com.spring.petclinic.controller;

import com.spring.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jsilva on 27/04/2020
 */
@RequestMapping("/vets")
@Controller
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping(value = {"", "index", "index.html"})
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("vets/index");
        mv.addObject("vets", vetService.findAll());
        return mv;
    }
}
