package com.one.digital.innovation.beerstock.repository;

import com.one.digital.innovation.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer,Long> {
    Optional<Beer> findByName(String name);
}
