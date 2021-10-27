package com.SuperHeroSquad.SuperHeroSquad.service;

import com.SuperHeroSquad.SuperHeroSquad.model.Formed;
import com.SuperHeroSquad.SuperHeroSquad.repository.DataHandler;
import com.SuperHeroSquad.SuperHeroSquad.repository.FormedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormedService {

    private final FormedRepository formedRepository;
    private final DataHandler dataHandler;

    @Autowired
    public FormedService(FormedRepository formedRepository, DataHandler dataHandler) {
        this.formedRepository = formedRepository;
        this.dataHandler = dataHandler;
    }

    public List<String> findFormedYearNumber(int number) {

        List<String> result = new ArrayList<>();

        List<Formed> formeds = formedRepository.

    }

}
