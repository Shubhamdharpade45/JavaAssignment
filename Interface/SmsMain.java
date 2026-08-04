package com.Interface;

public class SmsMain {
 public static void main(String[] args) {
	
	 MessageService m;
	 
	 m= new Whatsapp();
	 m.sendMessage("Hello");
	 
	 m= new Telegram();
	 m.sendMessage("Hiii");
	 
	 m= new Sms();
	 m.sendMessage("Hi");
	 
 }

}
