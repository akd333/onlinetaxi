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
import com.taxi.demo.Entity.VehicleAreaPrice;
import com.taxi.demo.service.EmailService;
import com.taxi.demo.service.TaxiService;

@Controller
public class EmailController {

	@Autowired
	private JavaMailSender sender;

	@Autowired
	private EmailService emailService;

	@Autowired
	TaxiService taxiService;

	// email sending to customer
	public void sendcustomer(UserDetails user, BookingDetails bookde, VehicleAreaPrice vehicleAreaPrice)
			throws MessagingException {

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setTo(user.getEmailId());
		helper.setText("Hi " + user.getCustomerName() + " your reference ID: ATX" + taxiService.refid()
				+ " TAXI request has been placed.Grand Total is Rs:" + taxiService.calculate(bookde, vehicleAreaPrice));
		helper.setSubject("Booking Confirmation from ONLINETAXI");

		sender.send(message);

	}

	// send mail to admin
	public void sendadmin(UserDetails user, BookingDetails bookingDetails, VehicleAreaPrice vehicleAreaPrice)
			throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setTo(user.getEmailId());
		ArrayList<String> allMail = emailService.allEmail();
		for (String em : allMail) {
			helper.setTo(em);
			helper.setText("there is a new booking from " + user.getCustomerName() + " Reference ID: ATX"
					+ taxiService.refid() + " Pickup From Bhubaneswar Airport Destination : "
					+ vehicleAreaPrice.getArea() + " Pickup Date: " + bookingDetails.getBookingDate() + " Pickup Time: "
					+ bookingDetails.getBookingTime() + " Number of Bags: " + bookingDetails.getNumberOfBag()
					+ " Number of passangers: " + bookingDetails.getNumberOfPax() + " Number of cars: "
					+ bookingDetails.getNumberOfVehicle() + " Car Type: " + vehicleAreaPrice.getVehicletype()
					+ " Contact No: " + user.getMobileNumber() + " Total price: "
					+ taxiService.calculate(bookingDetails, vehicleAreaPrice)

			);
			helper.setSubject("Booking Request new customer");
			sender.send(message);

		}

	}

}
