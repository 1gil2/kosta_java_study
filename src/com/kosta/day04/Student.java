package com.kosta.day04;

public class Student {
	String name;
	int no;
	String major;
	int age;
	
	Student() {
		System.out.println("�⺻������");
	}
	
	Student(String name, int no, String major, int age) {
		this.name = name;
		this.no = no;
		this.major = major;
		this.age = age;
	}
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void study() {
		System.out.println(name + "�л��� �����Ѵ�.");
	}
	String getMajor() {
		return name + "�л��� ������ " + major;
	}
	
	int getAge() {
		return age;
	}
}
