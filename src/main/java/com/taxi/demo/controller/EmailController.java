package com.taxi.demo.controller;

import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import com.taxi.demo.Entity.UserDetails;

@Controller
public class EmailController {

	
	
	@Autowired
    private JavaMailSender sender;

	public void send(UserDetails user) throws MessagingException {
		
		
		MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        
        	
                helper.setTo(user.getEmailId());
                helper.setText("Yo "+user.getCustomerName()+" keep calm our flying TAXI is on the way");
                helper.setSubject("Booking Confirmation from ONLINETAXI");
            
            sender.send(message);
		
    }
		
	}

