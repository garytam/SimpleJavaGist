package com.gtc.treeset;


import com.gtc.dto.Movie;
import com.gtc.util.MovieRepository;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TreeSetPoc {

    private TreeSet<Movie> buildTreeset(){
        TreeSet<Movie> treeSet = new TreeSet<>();

        HashSet<Movie> hashSet = new HashSet<>();

        List<Movie> movies = MovieRepository.getMovies();

        movies.forEach(movie -> {
            hashSet.add(movie);
            treeSet.add(movie);
        });


        return treeSet;
    }


    private void test1(){
        TreeSet<Movie> treeset = this.buildTreeset();
        treeset.forEach( movie -> System.out.println(movie));
    }


    public static void main(String[] args) {
        TreeSetPoc poc = new TreeSetPoc();
        poc.test1();
    }
}
