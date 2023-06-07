package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {

}
