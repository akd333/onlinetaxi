package com.taxi.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taxi.demo.Entity.AdminDetails;

public interface AdminDetailsRepository extends JpaRepository<AdminDetails, String>{

}
