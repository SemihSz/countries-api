package com.countries_api.controller;

import com.countries_api.model.Country;
import com.countries_api.model.response.CountriesResponse;
import com.countries_api.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountriesController {

    private final CountryService countryService;

    @GetMapping("/list")
    public ResponseEntity<List<Country>> getAllCountries() {

        return ResponseEntity.ok(countryService.getAllCountries());
    }

    @GetMapping("/name")
    public ResponseEntity<List<CountriesResponse>> getAllCountriesName() {

        return ResponseEntity.ok(countryService.getAllCountriesName());
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Country>> searchCountriesName(@PathVariable("name") String countryName) {

        return ResponseEntity.ok(countryService.searchCountries(countryName));
    }

    @GetMapping("/save")
    public ResponseEntity<Boolean> saveCountriesJson() {

        countryService.saveCountries();

        return ResponseEntity.ok(Boolean.TRUE);
    }
}
