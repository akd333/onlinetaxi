package com.taxi.demo.service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi.demo.Entity.AreaPrice;
import com.taxi.demo.Entity.BookingDetails;
import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.dao.AreaPriceRepository;
import com.taxi.demo.dao.BookingRepository;
import com.taxi.demo.dao.TaxiRepository;

@Service
public class TaxiService {

	@Autowired
	private TaxiRepository taxiRepository;

	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private AreaPriceRepository areaPriceRepository;

	public void adduser(UserDetails user) {

		taxiRepository.save(user);

	}

	public void addbooking(BookingDetails book) {

		bookingRepository.save(book);

	}
		public List<AreaPrice>showAll() {
//		List<AreaPrice> list=null;
//		List<Object[]> listArray=null;
//		Set<AreaPrice> setArea=null;
//		list=new ArrayList<AreaPrice>();
//		try {
//			list= areaPriceRepository.findAll();
//			listArray=areaPriceRepository.findArea();
//			for (Object[] objects : listArray) {
//				AreaPrice AreaPrice=new AreaPrice();
//				AreaPrice.setArea((String) objects[0]);
//				System.out.println(AreaPrice.getArea()+ "ggg");
//				list.add(AreaPrice);
//			}
//		 setArea=new HashSet<AreaPrice>();
//			for (AreaPrice areaPrice : setArea) {
//				setArea.add(areaPrice);
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return setArea;
//		}
		return areaPriceRepository.findAll(); 
		
		}
}
