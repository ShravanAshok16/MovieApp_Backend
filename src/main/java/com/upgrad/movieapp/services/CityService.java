package com.upgrad.movieapp.services;

import java.util.List;
import com.upgrad.movieapp.entities.City;

public interface CityService {
     City acceptCityDetails(City city);
     List<City> acceptMultipleCityDetails(List<City> cities);
     City updateCityDetails(int id, City city);
     City getCityDetails(int id);
     City getCityDetailsByCityName(String cityName);
     boolean deleteCity(int id);
     List<City> getAllCityDetails();
}
