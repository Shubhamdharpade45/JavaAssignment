package com.Interface;

public class SmartPhone implements Camera , MusicPlayer {
	
	@Override
	public void clickPhoto() {
		System.out.println("Photo Clicked by the Smartphonnr camera");
	}
	
	@Override
	public void playMusic() {
		
		System.out.println("Music played on Smartphone");
		
	}

}
