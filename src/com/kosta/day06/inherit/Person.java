package com.kosta.day06.inherit;

public class Person {
	String name;
	int age;
	String phone;
	
	Person(){
		
	}
	
	Person(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	void eat() {
		System.out.println("사람 " + name + "(" + age + ")" + "이 먹는다.");
	}
	
	void play() {
		System.out.println("사람 " + name + "(" + age + ")" + "이 운동한다.");
	}
}
