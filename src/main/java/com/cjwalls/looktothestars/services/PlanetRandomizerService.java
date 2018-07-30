package com.cjwalls.looktothestars.services;

import com.cjwalls.looktothestars.models.hibernate.dao.Planet;
import com.cjwalls.looktothestars.models.hibernate.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PlanetRandomizerService {

    @Autowired
    PlanetRepository repository;

    public PlanetRandomizerService() {}


    public Planet getRandomPlanet() {
        Long count = repository.count();
        int index = (int)(Math.random() * count);
        Page<Planet> planetPage = repository.findAll(new PageRequest(index, 1));
        Planet planet = null;
        if (planetPage.hasContent()) {
            planet = planetPage.getContent().get(0);
        }
        return planet;
    }


}
