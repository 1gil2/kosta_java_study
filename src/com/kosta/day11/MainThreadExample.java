package com.kosta.day11;

public class MainThreadExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		Thread t1 = new User1("USER1쓰레드", cal);
		Thread t2 = new User2("USER2쓰레드", cal);
		
		t1.start();
		t2.start();
		
	}

}
