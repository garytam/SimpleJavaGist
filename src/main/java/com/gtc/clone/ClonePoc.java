package com.gtc.clone;

import com.gtc.dto.MovieTheather;
import com.gtc.util.MovieRepository;
import com.gtc.util.MovieTheatherRepository;

public class ClonePoc {

    public static void main(String[] args) {
        MovieTheather theather1 = MovieTheatherRepository.getMovieTheather();
        MovieTheather thather2 = null;
        try {
            thather2 = (MovieTheather) theather1.clone();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("All Done");
    }
}
