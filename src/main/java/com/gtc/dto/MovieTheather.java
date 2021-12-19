package com.gtc.dto;

import java.util.List;

public class MovieTheather implements Cloneable  {

    private List<Movie> movies;
    private String name;
    private String location;

    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to new reference variable
        // t
        MovieTheather t = (MovieTheather)super.clone();


        // Create a new object for the field c
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
