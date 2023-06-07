package com.upgrad.movieapp.services;

import com.upgrad.movieapp.dao.MovieDAO;
import com.upgrad.movieapp.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    public MovieDAO movieDAO;

    @Override
    public Movie addMovieDetails(Movie movie) {
        return movieDAO.save(movie);
    }

    @Override
    public Movie getMovieDetails(int id) {
        return movieDAO.findById(id).get();
    }

    @Override
    @Transactional
    public List<Movie> acceptMultipleMovieDetails(List<Movie> movies) {


        List<Movie> savedMovies = new ArrayList<>();
        for(Movie movie : movies){
            savedMovies.add(addMovieDetails(movie));
        }
        return savedMovies;
    }

    @Override
    public Movie updateMovieDetails(int id, Movie movie) {
        Movie savedMovie = getMovieDetails(id);

        savedMovie.setMovieDescription(movie.getMovieDescription());
        savedMovie.setMovieId(movie.getMovieId());
        savedMovie.setMovieName(movie.getMovieName());
        savedMovie.setDuration(movie.getDuration());
        savedMovie.setReleaseDate(movie.getReleaseDate());
        savedMovie.setTrailerUrl(movie.getTrailerUrl());
        savedMovie.setCoverPhotoUrl(movie.getCoverPhotoUrl());

        return movieDAO.save(savedMovie);
    }

    @Override
    public boolean deleteMovie(int id) {
        Movie retrievedMovie = getMovieDetails(id);

        if(retrievedMovie == null){
            return false;
        }else {
            movieDAO.delete(retrievedMovie);
            return true;
        }
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDAO.findAll();
    }

    @Override
    public Page<Movie> getPaginatedMovieDetails(Pageable pageRequest) {
        return movieDAO.findAll(pageRequest);
    }
}
