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
		System.out.println("��� " + name + "(" + age + ")" + "�� �Դ´�.");
	}
	
	void play() {
		System.out.println("��� " + name + "(" + age + ")" + "�� ��Ѵ�.");
	}
}
