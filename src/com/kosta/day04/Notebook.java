package com.kosta.day04;

public class Notebook {
	private String macAddress;
	public String model;
	int price;
	private static int count = 0;
	
	public Notebook(String macAddress, String model, int price) {
		this.macAddress = macAddress;
		this.model = model;
		this.price = price;
	}
}
