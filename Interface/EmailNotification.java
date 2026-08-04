package com.Interface;

public class EmailNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Notification sent via Email");
		
	}

}
