package com.kosta.day08.lab;

public class RecTriangle extends Shape{
	
	double width;
	double height;
	int numSides = 3;
	
	public RecTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width*height/2;
	}

	@Override
	double getPerimeter() {
		return width + height + Math.sqrt(width*width + height*height);
	}
	
}
