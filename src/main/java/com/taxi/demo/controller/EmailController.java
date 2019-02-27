package com.taxi.demo.controller;

import java.util.ArrayList;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import com.taxi.demo.Entity.BookingDetails;
import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.service.EmailService;

@Controller
public class EmailController {

	@Autowired
	private JavaMailSender sender;

	@Autowired
	private EmailService emailService;

	public void sendCustomer(UserDetails user, BookingDetails bookde) throws MessagingException {

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		double totalprice = Integer.parseInt(bookde.getPrice());

		helper.setTo(user.getEmailId());
		try {
			totalprice = Integer.parseInt(bookde.getPrice()) * Integer.parseInt(bookde.getNumberOfVehicle());

		} catch (NumberFormatException e) {
			System.out.println("not a number" + bookde.getPrice() + bookde.getNumberOfVehicle());
		}

		helper.setText("Yo " + user.getCustomerName() + " keep calm our flying TAXI is on the way and price is Rs:"
				+ totalprice);
		helper.setSubject("Booking Confirmation from ONLINETAXI");

		sender.send(message);

	}

	public void sendAdmin(UserDetails user) throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		ArrayList<String> allMail = emailService.allEmail();
		for (String em : allMail) {
			helper.setTo(em);
			helper.setText("there is a new booking from " + user.getCustomerName());
			helper.setSubject("Booking Request new customer");
			sender.send(message);

		}

	}

}
