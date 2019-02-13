package com.taxi.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi.demo.Entity.BookingDetails;
import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.dao.BookingRepository;
import com.taxi.demo.dao.TaxiRepository;

@Service
public class TaxiService {

	@Autowired
	private TaxiRepository taxiRepository;
 
	 @Autowired
	 private BookingRepository bookingRepository;
	public void add(UserDetails user) {
		
		taxiRepository.save(user);

	}
	public void add1(BookingDetails book) {
		
		bookingRepository.save(book);

	}
}
