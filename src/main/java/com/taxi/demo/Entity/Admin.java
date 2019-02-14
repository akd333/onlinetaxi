package com.taxi.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	
	@Id
	private String eid;
	private String email;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
