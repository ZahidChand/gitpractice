package com.manytomanyrelationship.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(exclude = "publishers")

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_pub",
            joinColumns = @JoinColumn(name = "bk_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "pbr_id", referencedColumnName = "id"))

    private Set<Publisher> publishers;

    public Book(String name, Publisher publishers) {
        this.name = name;
        this.publishers = (Set<Publisher>) publishers;

    }
}