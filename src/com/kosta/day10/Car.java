package com.kosta.day10;

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
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Car)) return false;
		Car otherCar = (Car)obj;
		return this.model.equals(otherCar.model);
	}

	@Override
	public int compareTo(Car o) {
		// return this.price - o.price;
		//return this.model.compareTo(o.model);
		int aa = this.model.compareTo(o.model);
		if(aa == 0)
			return this.price - o.price;
		return aa;
	}
	
	public int compareTo2(Car o) {
		int aa = this.model.compareTo(o.model);
		if(aa == 0)
			return this.price - o.price;
		return aa;
	}

}