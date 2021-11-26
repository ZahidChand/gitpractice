package com.relationship.mapping.onetomany.repo;

import com.relationship.mapping.onetomany.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country,Integer>
{

}
