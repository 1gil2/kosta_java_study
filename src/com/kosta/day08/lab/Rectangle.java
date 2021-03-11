package com.kosta.day08.lab;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height;
	int numSides = 4;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}

	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return 2*(width + height);
	}

}
