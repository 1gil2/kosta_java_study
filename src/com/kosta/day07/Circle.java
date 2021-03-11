package com.kosta.day07;


//shape은 추상class
//Circle은 추상class를 상속받았으므로 반드시 추상메서드를 구현할 의무가 있다.
public class Circle extends Shape{

	int radius;
	double circumference;
	
	Circle(String color, int radius){
		super(color, "Circle");
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	public int getRadius() {
		return radius;
	}
	
}
