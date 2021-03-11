package com.kosta.day07;

public class SamsungTV extends sfdad{

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + " 전원을 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + " 전원을 끈다.");
		
	}
	
	public void display() {
		System.out.println(getClass().getSimpleName() + " display추가기능");
	}
	
}
