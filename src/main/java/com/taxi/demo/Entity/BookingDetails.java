package com.taxi.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="booking_details")
public class BookingDetails {

	@Id
	@OnDelete(action = OnDeleteAction.CASCADE)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="trip_id" )
	private Long tripId;

	@Column(name="pickup_date" )
	private String bookingDate; 
	
	@Column(name="pickup_time" )
	private String bookingTime;
	
	@Column(name="numberofpax" )
	private String numberOfPax;
	
	@Column(name="numberofbag" )
	private String numberOfBag;
	
	@Column(name="numberofvehicle" )
	private String numberOfVehicle;
	
	@Column(name="price" )
	private String price;

	@Column(name="flightno" )
	private Long flightNo;
	
	@Column(name="flighttime" )
	private String flightTime;
	
	@Column(name="flightdate" )
	private String flightDate;
		
	public Long getTripId() {
		return tripId;
	}

	public void setTripId(Long tripId) {
		this.tripId = tripId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getNumberOfPax() {
		return numberOfPax;
	}

	public void setNumberOfPax(String numberOfPax) {
		this.numberOfPax = numberOfPax;
	}

	public String getNumberOfBag() {
		return numberOfBag;
	}

	public void setNumberOfBag(String numberOfBag) {
		this.numberOfBag = numberOfBag;
	}

	public String getNumberOfVehicle() {
		return numberOfVehicle;
	}

	public void setNumberOfVehicle(String numberOfVehicle) {
		this.numberOfVehicle = numberOfVehicle;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(Long flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	
}
