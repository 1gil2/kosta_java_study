package com.kosta.day06;

import java.time.Year;

//class : object 만드는 틀이다.
//object : class를 이용해서 만든 독립된 개체이다.

public class Car {
	//1. 멤버변수(field) : non-static(instance변수), static(class변수)
	private int speed;
	private boolean stop;
	private static int count; //object공유변수
	private static final String COMPANY = "현대자동차"; //상수
	private final int year; //instance변수, final은 한번 setting, 변경불가
	
	//2. 생성자...new시에 자동호출되는 메서드
	public Car() {
		this(0, false, 2021);
	}
	
	public Car(int speed, boolean stop, int year) {
		super();
		this.speed = speed;
		this.stop = stop;
		this.year = year;
		count++;
		System.out.println(this.getClass().getSimpleName() + "생성");
	}


	//3.일반메서드
	//getter/setter : 외부에서 값을 읽거나 수정할 때 사용
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Car.count = count;
	}
	//static method : 객체생성없이 호출가능
	public static String getCompany() {
		return COMPANY;
	}

	public int getYear() {
		return year;
	}
	
	public void print() {
		System.out.println("-----Car정보-----");
		System.out.println(speed + "," + stop + "," + year + "," + count + "," + COMPANY);
	}
	//4. instance block, static block
	{
		System.out.println("instance생성시 마다 수행된다.");
		System.out.println("***********************");
	}
	
	static {
		System.out.println("class가 load시에 수행된다.");
		System.out.println("######################");
	}
}
