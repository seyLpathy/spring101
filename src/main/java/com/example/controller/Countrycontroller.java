package com.example.controller;

import com.example.DTO.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Countrycontroller {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country c = Country.of("France",67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Europe")
                .header("capital","Paris")
                .header("favorite food","cheese and wine")
                .body(c);

    }

    @GetMapping("/all")
    public List<Country> all(){
        Country france = Country.of("France",57);
        Country germany = Country.of("Germany",65);
        return List.of(france,germany);
    }
}
