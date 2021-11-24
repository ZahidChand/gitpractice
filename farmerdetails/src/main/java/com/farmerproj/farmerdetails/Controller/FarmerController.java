package com.farmerproj.farmerdetails.Controller;

import com.farmerproj.farmerdetails.Entity.Farmer;
import com.farmerproj.farmerdetails.Service.FarmerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    private static final Logger log = LoggerFactory.getLogger(FarmerController.class);


    @GetMapping("/get")
    public List<Farmer> getAll() {
        log.info("Value Fetched Successfully.......");
        return farmerService.getAllFarmers();
    }

    @PostMapping("/farmer")
    public Farmer saveFarmer(@RequestBody Farmer farmer) {
        log.info("Value Inserted Successfully Into The Database.........");
        return farmerService.saveFarmer(farmer);
    }

    @DeleteMapping("/farmer/{id}")
    public String deleteFarmer(@PathVariable int id) {
        farmerService.deleteFarmer(id);
        log.info("Farmer Deleted Successfully.....");
        return "Deleted Successfully...";
    }
    @PutMapping("/farmer")
    public Farmer updateFarmer(@RequestBody Farmer farmer)
    {
        log.info("Farmer Updated Successfully.....");
        return farmerService.updateFarmer(farmer);
    }

}
