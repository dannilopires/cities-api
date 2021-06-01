package com.dannilo.Cidades.API.cities.repositories;

import com.dannilo.Cidades.API.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}