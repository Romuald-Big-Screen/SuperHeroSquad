package com.SuperHeroSquad.SuperHeroSquad.controller;

import com.SuperHeroSquad.SuperHeroSquad.service.FormedService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FormedController {

    private final FormedService formedService;

    public FormedController(FormedService formedService) {
        this.formedService = formedService;
    }

    @RequestMapping(value = "formedYear", method = RequestMethod.GET)
    public List<String> formedYearList(@RequestParam(name = "formed") int number) {

        return this.formedService.findFormedYearNumber(number);
    }

}
