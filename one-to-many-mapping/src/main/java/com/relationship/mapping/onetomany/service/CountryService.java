package com.relationship.mapping.onetomany.service;

import com.relationship.mapping.onetomany.entity.City;
import com.relationship.mapping.onetomany.entity.Country;
import com.relationship.mapping.onetomany.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryService {

    @Autowired
    private CountryRepo countryRepo;

    public List<Country> getCountry()
    {
        return  countryRepo.findAll();
    }
    public Country getById(int id)
    {
        return countryRepo.getById(id);
    }
    public  Country addCountry(Country country)
    {
        return countryRepo.save(country);
    }
    public boolean deleteById(int id)
    {
        countryRepo.deleteById(id);
        return  true;
    }
}
