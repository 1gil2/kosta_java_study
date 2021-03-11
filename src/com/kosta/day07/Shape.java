package com.kosta.day07;

//abstract class : abstract method 가 하나이상 존재한다.
//abstract method : 함수의 정의는 있으나 구현은 없다.
//구현은 이 class상속받은 자식이 반드시 구현한다.
public abstract class Shape {
	private String color;
	private String type;
	
	
	public Shape(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	
	public abstract double getArea();

	public abstract double getPerimeter();
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return color + " " + type;
	}
	
	
}
