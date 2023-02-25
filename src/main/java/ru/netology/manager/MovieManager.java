package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {

    private int countMovie = 10;
    private Movie[] movies = new Movie[0];

    public MovieManager(int countMovie) {
        this.countMovie = countMovie;
    }

    public MovieManager() {
    }

    public void add(Movie movie) {
        Movie[] tmp = new Movie[movies.length +1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findLastTen() {

        int resultLength = movies.length;
        if (resultLength >= countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Movie[] findAll() {
        return movies;
    }
}