package com.taxi.demo.controller;

import javax.mail.MessagingException;

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
	
	@Autowired
	private EmailController emailController;
	
	@GetMapping("/booktaxi")
	 public	String show()

	 {
		 return "local_booking";
	 }
	
	@PostMapping("/save")
	public String init(@ModelAttribute UserDetails user,@ModelAttribute BookingDetails book) throws MessagingException
	{
		taxiservice.add(user);
		taxiservice.add1(book);
		emailController.send(user);
		
		return "local_booking";
	}

}
