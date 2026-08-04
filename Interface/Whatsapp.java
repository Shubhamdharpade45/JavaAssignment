package com.Interface;

public class Whatsapp  implements MessageService {

	
	

	@Override
	public void sendMessage(String message) {
		System.out.println("Message Through Whatsapp "+message);
		
	}
	
	

}
