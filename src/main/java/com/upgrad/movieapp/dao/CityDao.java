package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
    City findByCityName(String cityName);
}
