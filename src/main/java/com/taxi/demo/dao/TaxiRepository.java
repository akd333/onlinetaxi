package com.taxi.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxi.demo.Entity.UserDetails;

@Repository
public interface TaxiRepository extends JpaRepository<UserDetails, Long>{

}
