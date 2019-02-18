package com.taxi.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.taxi.demo.Entity.AreaPrice;
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
	public String show() {
		return "local_booking";
	}
	
	@ModelAttribute("areas")
	 public List<AreaPrice> show(Map<String, Object> map)

	 {
		List<AreaPrice> listarea= taxiservice.showAll();
		return listarea;
	 }
	
	@PostMapping("/save")
	public String init(@ModelAttribute UserDetails user,@ModelAttribute BookingDetails book) throws MessagingException
	{
		taxiservice.adduser(user);
		taxiservice.addbooking(book);
		emailController.sendcustomer(user);
		emailController.sendadmin(user);	
		return "local_booking";
	}

}
