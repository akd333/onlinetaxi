package com.taxi.demo.controller;


import java.util.ArrayList;

import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taxi.demo.Entity.BookingDetails;
import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.Entity.VehicleAreaPrice;
import com.taxi.demo.service.SmsService;
import com.taxi.demo.service.TaxiService;

@Controller
public class TaxiController {

	@Autowired
	private TaxiService taxiservice;
	
	@Autowired
	private EmailController emailController;
	
	@Autowired
	private SmsService smsService;
	
	@RequestMapping(value="booktaxi",method=RequestMethod.GET)
	 public	String booking()

	 {
		
		 return "local_booking";
	 }
	
	
	
	//index page
		
		@RequestMapping(value="welcome",method=RequestMethod.GET)
		 public	String show()

		 {
			
			 return "save";
		 }

	//	area in dropdown
	@ResponseBody
	@ModelAttribute("area")
	public List<VehicleAreaPrice> findTyreArea(HttpServletRequest request){
		List<VehicleAreaPrice> listdto=null ;
		
		try{
		//get All area 
		listdto=taxiservice.showArea();
		}
		catch(Exception e){
			request.setAttribute("area","INTERNAL SOME PROBLEM");
			return listdto;
		}
	
		return listdto;
	}
	
	
	
	//vehicle type after selecting area
		@ResponseBody
		@GetMapping("/vehicleAndArea/{area}")
		public List<String>  VehicleByArea(@PathVariable("area")String area,HttpServletRequest request){
			
			List<String> listVehicle=null;
			listVehicle =new ArrayList<>();
			try {
				listVehicle =taxiservice.ListVehicleType(area);
			
			}
			 catch(Exception e){
					request.setAttribute("area","INTERNAL SOME PROBLEM");
					return listVehicle;	
					
			 }
			System.out.println("vehicle "+listVehicle);
			return listVehicle;
			}
		
		
		
		//price after selecting area and vehicle type
		@ResponseBody
		@RequestMapping(value="/vehicleAndAreaPrice/{area},{vehicletype}",method=RequestMethod.GET)
		public Double priceByAreaAndVehicle(@PathVariable("area")String area,@PathVariable("vehicletype")String vehicletype){
			Double price=taxiservice.priceByAreaAndVehicle(area, vehicletype);
			
			return price;
		}
		
	
	
	//add data and send email
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String userDetails(@ModelAttribute UserDetails user,@ModelAttribute BookingDetails book,HttpServletRequest req) throws MessagingException
	{
		
		
	
		
		try {
		taxiservice.adduser(user);
		taxiservice.addbooking(book);
		emailController.sendCustomer(user,book);
		emailController.sendAdmin(user);
		smsService.sendSms();
		req.setAttribute("book", "Successfully booked");
		return "save";
		}
		catch(Exception e) {
			
			System.out.println("Exception");
			e.printStackTrace();
			req.setAttribute("book", "Unsuccessfully booked");
			return "save";
		}
		
		
	}

}
