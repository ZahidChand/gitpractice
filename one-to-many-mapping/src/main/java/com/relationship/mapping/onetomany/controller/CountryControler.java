package com.relationship.mapping.onetomany.controller;


import com.relationship.mapping.onetomany.entity.Country;
import com.relationship.mapping.onetomany.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryControler
{
    @Autowired
    private CountryService countryService;


    @GetMapping("/country")
    public List<Country> getAllCountry()
    {
        return countryService.getCountry();
    }

    @PostMapping("/country")
    public Country addCountry(@RequestBody Country country)
    {
        return  countryService.addCountry(country);
    }
    @PutMapping("/country")
    public Country updateCountry(@RequestBody Country country)
    {
        return countryService.addCountry(country);
    }
    @DeleteMapping("/country/{id}")
    public void deleteCountry(int id)
    {
        countryService.deleteById(id);
    }
    @GetMapping("/country/{id}")
    public  Country getByCountryId(@PathVariable int id )
    {
        return countryService.getById(id);
    }
}
