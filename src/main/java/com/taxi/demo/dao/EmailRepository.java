package com.taxi.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taxi.demo.Entity.Admin;

public interface EmailRepository extends JpaRepository<Admin, String>{

}
