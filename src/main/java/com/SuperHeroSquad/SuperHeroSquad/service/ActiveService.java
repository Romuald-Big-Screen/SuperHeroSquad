package com.SuperHeroSquad.SuperHeroSquad.service;

import com.SuperHeroSquad.SuperHeroSquad.repository.ActiveRepository;
import org.springframework.stereotype.Service;

@Service
public class ActiveService {
    private final ActiveRepository activeRepository;

    public ActiveService(ActiveRepository activeRepository) {
        this.activeRepository = activeRepository;
    }
}
