package com.taxi.demo.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AreaPrice {
	@Id
	private Long id;
	private String area;
	private String vehicle;
	private String price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
