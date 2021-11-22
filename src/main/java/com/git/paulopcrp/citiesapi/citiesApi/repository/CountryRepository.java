package com.git.paulopcrp.citiesapi.citiesApi.repository;

import com.git.paulopcrp.citiesapi.citiesApi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
