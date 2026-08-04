package com.Interface;

public class MusicMain {
	public static void main(String[] args) {

		MediaPlayer m;

		m = new Mp3();
		m.play();
		
		m = new VideoPlayer();
		m.play();

	}
}
