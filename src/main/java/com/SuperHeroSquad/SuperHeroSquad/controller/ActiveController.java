package com.SuperHeroSquad.SuperHeroSquad.controller;

import com.SuperHeroSquad.SuperHeroSquad.service.ActiveService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveController {

    private final ActiveService activeService;

    public ActiveController(ActiveService activeService) {
        this.activeService = activeService;
    }



}
