package com.taxi.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taxi.demo.Entity.AreaPrice;

public interface AreaPriceRepository extends JpaRepository<AreaPrice, Long>{

	@Query("SELECT e.area FROM AreaPrice e ")
	public List<Object[]> findArea();
	
}
