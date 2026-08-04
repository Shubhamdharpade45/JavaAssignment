package com.Interface;

public class NoticationMain {

	public static void main(String[] args) {
		Notification n;

		n = new EmailNotification();
		n.sendNotification();

		n = new SMSnotification();
		n.sendNotification();

	}
}
