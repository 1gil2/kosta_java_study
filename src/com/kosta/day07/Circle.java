package com.kosta.day07;


//shape�� �߻�class
//Circle�� �߻�class�� ��ӹ޾����Ƿ� �ݵ�� �߻�޼��带 ������ �ǹ��� �ִ�.
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
