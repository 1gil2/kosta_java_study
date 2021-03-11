package com.kosta.day07;

public class Rectangle extends Shape{

	int width;
	int height;
	
	public Rectangle(String color, int width, int height) {
		super(color, "Ractangle");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width + height);
	}

}
