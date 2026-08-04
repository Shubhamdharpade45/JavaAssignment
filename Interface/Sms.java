package com.Interface;

public class Sms implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("Message through SMS " + message);
		
	}


}
