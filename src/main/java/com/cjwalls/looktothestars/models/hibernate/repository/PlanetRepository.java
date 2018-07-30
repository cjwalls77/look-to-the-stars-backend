package com.cjwalls.looktothestars.models.hibernate.repository;

import com.cjwalls.looktothestars.models.hibernate.dao.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
