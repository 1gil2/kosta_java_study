package com.kosta.day07;

public class LgTV extends sfdad{

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + " ������ �Ҵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + " ������ ����.");
	}		

}
