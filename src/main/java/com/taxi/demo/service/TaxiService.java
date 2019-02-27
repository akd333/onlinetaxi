package com.taxi.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi.demo.Entity.BookingDetails;
import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.Entity.VehicleAreaPrice;
import com.taxi.demo.dao.BookingRepository;
import com.taxi.demo.dao.TaxiRepository;

@Service
public class TaxiService {

	@Autowired
	private TaxiRepository taxiRepository;
 
	 @Autowired
	 private BookingRepository bookingRepository;
	
	 
	 
	//service for show area in dropdown
		public List<VehicleAreaPrice> showArea(){
			List<Object[]> listObject=null;
			List<VehicleAreaPrice> listarea=new ArrayList<>();
//			listarea=new ArrayList<VehicleAreaPrice>();
			
			listObject=taxiRepository.areafind();
			
			for(Object obj: listObject){
			
				VehicleAreaPrice pricede=new VehicleAreaPrice();
				String areatype= (String)obj;
				pricede.setArea(areatype);
				listarea.add(pricede);
			}
			return listarea;
		}
	 
	 
	 
	 
		//show vehicle type after area
	      public List<String> ListVehicleType(String area) {
			
			List<String> listObject=null;
			List<VehicleAreaPrice> listVehicle =null;
			
			listVehicle=new ArrayList<VehicleAreaPrice>();
			listObject=taxiRepository.vehicleByArea(area);
			
			for(Object obj : listObject)
			{
				VehicleAreaPrice pricede=new VehicleAreaPrice();
				String vehicletype=(String)obj;
				pricede.setVehicletype(vehicletype);
//				listVehicle.add(pricede);
				
			}
			
			return listObject;
		
		}
	      
	      
	      
	      
	      
	    //price after area and vehicle
	      public Double priceByAreaAndVehicle(String area,String vehicletype) {
	  		Double  price=0.0;
//	  		System.out.println(area);
//	  		System.out.println(vehicletype);
	  		price=taxiRepository.priceByAreaAndVehicleType(area, vehicletype);
//	  		System.out.println(" PRICE "+price);
	  		return price;
	  	}
	      
	 
	 
	 
	 //add data of user
	 public void adduser(UserDetails user) {
		
		taxiRepository.save(user);

	}
	 
	 //add booking details
	public void addbooking(BookingDetails book) {
		
		bookingRepository.save(book);

	}
	
}
