package com.farmerproj.farmerdetails.Entity;

import javax.persistence.*;

@Entity
public class Farmer {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;


    public Farmer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Farmer() {
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
