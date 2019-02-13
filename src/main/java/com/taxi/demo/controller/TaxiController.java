package com.taxi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.taxi.demo.Entity.BookingDetails;
import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.service.TaxiService;

@Controller
public class TaxiController {

	@Autowired
	private TaxiService taxiservice;
	
	@GetMapping("/booktaxi")
	 public	String show()

	 {
		 return "local_booking";
	 }
	
	@PostMapping("/save")
	public String init(@ModelAttribute UserDetails user,@ModelAttribute BookingDetails book)
	{
		taxiservice.add(user);
		taxiservice.add1(book);
		return "local_booking";
	}

}
