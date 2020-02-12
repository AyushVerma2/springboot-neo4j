package com.example.neo4j.com.example.neo4j.domain;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;


/**
 * @author Ayush
 */
@NodeEntity
public class Movie {


    private String title;
    private String director;

    public Movie() {
    }


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }


}