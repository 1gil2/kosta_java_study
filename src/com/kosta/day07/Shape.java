package com.kosta.day07;

//abstract class : abstract method �� �ϳ��̻� �����Ѵ�.
//abstract method : �Լ��� ���Ǵ� ������ ������ ����.
//������ �� class��ӹ��� �ڽ��� �ݵ�� �����Ѵ�.
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
