package com.spring.petclinic.controller;

import com.spring.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jsilva on 27/04/2020
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = {"", "index", "index.html"})
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("owners/index");
        mv.addObject("owners", ownerService.findAll());
        return mv;
    }
}
