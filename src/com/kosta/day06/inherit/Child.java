package com.kosta.day06.inherit;

//자식이 부모를 선택한다.
public class Child extends Parent{

	int b = 20;
	
	public Child() {
		//super(); 자동으로 부모생성
		System.out.println("자식의 생성자");
	}
	
	void parentPrint() {
		System.out.println("a = " + a);
		method1();
	}
	
	void method1() {
		System.out.println("재정의");
	}

}
