package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreDAO extends JpaRepository<Theatre, Integer> {
     List<Theatre> findByTheatreName(String theatreName);
     List<Theatre> findByTicketPriceLessThan(float price);
     List<Theatre> findByTheatreNameContaining(String theatreName);
}
