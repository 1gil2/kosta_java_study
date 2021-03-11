package com.kosta.day08.lab;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 6);
		RecTriangle recTriangle = new RecTriangle(6, 2);

		Shape[] arr = new Shape[2];
		arr[0] = rectangle;
		arr[1] = recTriangle;

		for(int i =0; i<2;i++) {
			System.out.println("area : " + arr[i].getArea());
			System.out.println("perimeter : " + arr[i].getPerimeter());
			if(arr[i] instanceof Rectangle) {
				((Rectangle)arr[i]).resize(0.5);
				System.out.println("new area : " + arr[i].getArea());
				System.out.println("new perimeter : " + arr[i].getPerimeter());
			}
		}
	}

}
