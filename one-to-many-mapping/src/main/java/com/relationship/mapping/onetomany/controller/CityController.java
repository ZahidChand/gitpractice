package com.relationship.mapping.onetomany.controller;

import com.relationship.mapping.onetomany.entity.City;
import com.relationship.mapping.onetomany.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public List<City> getAllCity()
    {
        return cityService.getCity();
    }

    @PostMapping("/city")
    public City addCity(@RequestBody City city)
    {
        return  cityService.addCity(city);
    }
    @PutMapping("/city")
    public City updateCity(@RequestBody City city)
    {
        return cityService.addCity(city);
    }
    public void deleteCity(int id)
    {
        cityService.deleteById(id);
    }
    @GetMapping("/city/{id}")
    public  City getByCityId(@PathVariable int id )
    {
        return cityService.getById(id);
    }


}
