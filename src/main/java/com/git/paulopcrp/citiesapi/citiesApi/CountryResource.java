package com.git.paulopcrp.citiesapi.citiesApi;

import com.git.paulopcrp.citiesapi.citiesApi.countries.Country;
import com.git.paulopcrp.citiesapi.citiesApi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public Page<Country> countries(Pageable page) {
    return repository.findAll(page);
    }

}
