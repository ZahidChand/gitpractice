package com.farmerproj.farmerdetails.Dao;

import com.farmerproj.farmerdetails.Entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerDao extends JpaRepository<Farmer,Integer>
{



}
