package com.manytomanyrelationship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Publisher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "publishers")
    private Set<Book>books= new HashSet<>();

    public Publisher(String name) {
        this.name = name;
    }


}
