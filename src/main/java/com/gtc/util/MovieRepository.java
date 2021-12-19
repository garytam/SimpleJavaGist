package com.gtc.util;

import com.gtc.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    public static List<Movie> getMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jaws", 1976, "Spilberg", 100));
        movies.add(new Movie("ET", 1982, "Spilberg", 100));
        movies.add(new Movie("Close Encounter", 1983, "Spilberg", 100));
        movies.add(new Movie("Star Was", 1981, "Lucas", 100));


        return movies;
    }
}
