package com.taxi.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.taxi.demo.Entity.Admin;
import com.taxi.demo.dao.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository emailRepository;

		public ArrayList<String> allEmail() {
			ArrayList<String> allMail=new ArrayList<String>();
			 Iterable<Admin> mail=emailRepository.findAll();
			 for (Admin email : mail) {
				 allMail.add(email.getEmail());
				 
			}
		return allMail;
		}
	}
	
	

