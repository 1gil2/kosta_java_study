package com.kosta.day09.api;

import java.util.Arrays;

public class Car implements Cloneable {
	String model;
	int price;
	String[] accessory;
	
	public Car(String model, int price, String[] accessory) {
		super();
		this.model = model;
		this.price = price;
		this.accessory = accessory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", accessory=" + Arrays.toString(accessory) + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Car car = (Car)super.clone();
		car.accessory = Arrays.copyOf(this.accessory, this.accessory.length);
		
		return super.clone();
	}

	
	
}
