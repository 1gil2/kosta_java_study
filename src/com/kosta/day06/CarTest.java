package com.kosta.day06;

public class CarTest {

	public static void main(String[] args) {
		//class method ȣ��
		System.out.println(Car.getCompany());
		Car.setCount(10);
		System.out.println(Car.getCount());

		Car c1 = new Car();
		//instance method ȣ��
		System.out.println(c1.getSpeed());
		c1.print();

		Car c2 = new Car(100, true, 2020);
		c2.print();
	}
}
