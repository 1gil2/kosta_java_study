package com.kosta.day04;


//class : object를 만드는 틀
//		- 변수와 메서드들의 묶음
//object : class를 이용해서 만든 독립된 개체
//instance : object실체
public class Car {
	//1. 특징, 멤버변수, field
	String model;
	int year;
	int price;
	String color;
	
	//2. 기능, 메서드, 함수
	void go() {
		System.out.println("앞으로 go");
	}
	void back() {
		System.out.println("뒤로 back");
	}
}
