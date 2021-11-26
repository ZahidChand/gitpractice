package com.relationship.mapping.onetomany.service;

import com.relationship.mapping.onetomany.entity.City;
import com.relationship.mapping.onetomany.repo.CityRepo;
import com.relationship.mapping.onetomany.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService
{
    @Autowired
    private CityRepo cityRepo;

    public List<City> getCity()
    {
        return  cityRepo.findAll();
    }
    public City getById(int id)
    {
        return cityRepo.getById(id);
    }
    public  City addCity(City city)
    {
        return cityRepo.save(city);
    }
    public boolean deleteById(int id)
    {
        cityRepo.deleteById(id);
        return  true;
    }

}
