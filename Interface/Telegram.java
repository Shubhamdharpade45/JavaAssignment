package com.Interface;

public class Telegram  implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Message Through Telegram "+message);
		
	}

}
