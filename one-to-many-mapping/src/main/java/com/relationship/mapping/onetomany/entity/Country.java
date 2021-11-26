package com.relationship.mapping.onetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data


@Entity
public class Country
{
    @Id
    private int countryId;
    private String countryName;
    private String countryContinent;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cId",referencedColumnName = "countryId")
    private List<City> cities;

}
