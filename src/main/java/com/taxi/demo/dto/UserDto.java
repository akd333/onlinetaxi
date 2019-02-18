package com.taxi.demo.dto;
public class UserDto {
	
	private Long userId;
	private String airport;
	private String city;
	private Long mobileNumber;
	private String emailId;
	private String bookingDate;
	private String bookingTime;
	private String customerName;
	private String address;
	private String numberOfPax;
	private String numberOfBag;
	private String numberOfVehicle;
	private String price;
	private String flightNumber;
	private String flightDate;
	private String flightTime;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
