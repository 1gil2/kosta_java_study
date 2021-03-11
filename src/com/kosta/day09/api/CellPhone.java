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
		if(time < 0) throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		
		System.out.println("��ȭ �ð� : " + time + "��");
		battery -= time*0.5;
		if(battery < 0)
			battery = 0;
		
	}
	
	public void charge(int time) {
		if(time < 0) throw new IllegalArgumentException("�����ð��Է¿���");
		
		System.out.println("���� �ð� : " + time + "��");
		battery += time*3;
		if(battery > 100.0)
			battery = 100.0;
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : " + battery);
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
