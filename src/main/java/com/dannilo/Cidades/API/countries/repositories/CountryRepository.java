package com.dannilo.Cidades.API.countries.repositories;

import com.dannilo.Cidades.API.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
