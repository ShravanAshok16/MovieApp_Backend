package com.upgrad.movieapp.services;

import com.upgrad.movieapp.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {

     Movie addMovieDetails(Movie movie);
     Movie getMovieDetails(int id);
     List<Movie> acceptMultipleMovieDetails(List<Movie> movies);
     Movie updateMovieDetails(int id, Movie movie);
     boolean deleteMovie(int id);
     List<Movie> getAllMovies();
     Page<Movie> getPaginatedMovieDetails(Pageable pageRequest);
}
