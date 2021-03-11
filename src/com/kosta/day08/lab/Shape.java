package com.kosta.day08.lab;

public abstract class Shape {
	
	int numSides;
	
	public Shape() {
		
	}
	
	public Shape(int numSides) {
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	abstract double getArea();
	abstract double getPerimeter();
}
