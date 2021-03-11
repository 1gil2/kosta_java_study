package com.kosta.day11;

public class Car implements Comparable<Car>{
	private String model;
	private int price;

	public Car() {
		
	}
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Car o) {
		
		return this.model.compareTo(o.model);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
