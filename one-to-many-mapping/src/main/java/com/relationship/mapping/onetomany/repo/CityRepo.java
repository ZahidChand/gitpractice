package com.relationship.mapping.onetomany.repo;

import com.relationship.mapping.onetomany.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City,Integer> {
}
