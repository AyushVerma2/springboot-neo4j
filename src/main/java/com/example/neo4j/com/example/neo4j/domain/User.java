package com.example.neo4j.com.example.neo4j.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class User {


    private String name;
    private Integer age;

    @Relationship(type = "RATED", direction = Relationship.INCOMING)
    private List<Movie> movies;

    public User() {

    }

    public List<Movie> getMovies() {
        return movies;
    }



    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}



