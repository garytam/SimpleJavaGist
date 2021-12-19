package com.gtc.util;

import com.gtc.dto.MovieTheather;

public class MovieTheatherRepository {

    public static MovieTheather getMovieTheather(){
        MovieTheather cineplex1 = new MovieTheather();
        cineplex1.setLocation("Markham");
        cineplex1.setName("Cinplex Mugen");

        cineplex1.setMovies(MovieRepository.getMovies());

        return cineplex1;
    }
}
