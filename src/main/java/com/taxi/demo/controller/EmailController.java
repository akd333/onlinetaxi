package com.taxi.demo.controller;

import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.service.EmailService;

@Controller
public class EmailController {

	
	
	@Autowired
    private JavaMailSender sender;
	
	@Autowired
	private EmailService emailService;

	public void sendcustomer(UserDetails user) throws MessagingException {
		
		
		MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        
        	
                helper.setTo(user.getEmailId());
                helper.setText("Yo "+user.getCustomerName()+" keep calm our flying TAXI is on the way");
                helper.setSubject("Booking Confirmation from ONLINETAXI");
            
            sender.send(message);
		
    }

	public void sendadmin(UserDetails user) throws MessagingException {
		 MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message,true);
//	        FileSystemResource file = new FileSystemResource("D:\\new1.pdf");
	       
	        
	        ArrayList<String> allMail = emailService.allEmail();
	        for (String em : allMail) {
//	        	try {
	                helper.setTo(em);
	                helper.setText("there is a new booking from "+user.getCustomerName());
	                helper.setSubject("Booking Request new customer");
	                
//	        		helper.addAttachment(file.getFilename(), file);
	                
//	            } 
//	        	catch (MessagingException e)
//	        	{
//	                e.printStackTrace();
//	                return "Error while sending mail ..";
//	            }
	        	sender.send(message);
		
	}
		
	}
		
	}

