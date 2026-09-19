package com.example.controller;

import com.example.DTO.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Countrycontroller {

    @GetMapping("/france")
    public Country france(){
        return Country.of("France",57);

    }

    @GetMapping("/all")
    public List<Country> all(){
        Country france = Country.of("France",57);
        Country germany = Country.of("Germany",65);
        return List.of(france,germany);
    }
}
