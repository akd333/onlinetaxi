package com.taxi.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.taxi.demo.Entity.AdminDetails;
import com.taxi.demo.dao.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository emailRepository;

		public ArrayList<String> allEmail() {
			ArrayList<String> allMail=new ArrayList<String>();
			 Iterable<AdminDetails> mail=emailRepository.findAll();
			 for (AdminDetails email : mail) {
				 allMail.add(email.getEmail());
				 
			}
		return allMail;
		}
	}
	
	

