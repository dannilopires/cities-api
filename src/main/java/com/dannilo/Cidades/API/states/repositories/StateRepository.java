package com.dannilo.Cidades.API.states.repositories;

import com.dannilo.Cidades.API.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
