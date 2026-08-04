package com.Interface;

public class SMSnotification  implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("NOtification send via SMS");
		
	}
}
