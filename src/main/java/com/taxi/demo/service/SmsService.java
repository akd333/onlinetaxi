package com.taxi.demo.service;
import org.springframework.stereotype.Service;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
@Service
public class SmsService {
	public static final String ACCOUNT_SID = "ACa0e0b2c75572c402a381ecdb0fb0bf03";
    public static final String AUTH_TOKEN = "2b49e06464951a3f66751cb9ae082937";

    public void sendSms() {
    	
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                    new com.twilio.type.PhoneNumber("+917008335346"),
                    new com.twilio.type.PhoneNumber("+12015156757"),
                    "Booking request from new user. Please confirm the booking.")
                .create();
            System.out.println(message.getSid());
    }
}