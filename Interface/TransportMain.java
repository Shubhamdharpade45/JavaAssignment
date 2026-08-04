package com.Interface;

public class TransportMain {
	public static void main(String[] args) {
		
		Transport t;
		t=new Bus();
		t.travel();
		
		t=new Train();
		t.travel();

	}

}
