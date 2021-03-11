package com.kosta.day09.api;

public class CellPhone {
	private String model;
	private double battery;
	
	public CellPhone() {
	}
	public CellPhone(String model) {
		this.model = model;
	}
	
	public void call(int time) {
		if(time < 0) throw new IllegalArgumentException("통화시간입력오류");
		
		System.out.println("통화 시간 : " + time + "분");
		battery -= time*0.5;
		if(battery < 0)
			battery = 0;
		
	}
	
	public void charge(int time) {
		if(time < 0) throw new IllegalArgumentException("충전시간입력오류");
		
		System.out.println("충전 시간 : " + time + "분");
		battery += time*3;
		if(battery > 100.0)
			battery = 100.0;
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : " + battery);
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone) {
			CellPhone cellPhone = (CellPhone) otherObject;
			if(model.equals(((CellPhone) otherObject).model))
				return true;
		}
		return false;
	}
	
}
