package com.kosta.day06.inherit;

public class Student extends Person{
	String number;
	String major;
	
	Student(){
		super();
	}
	
	Student(String name, int age, String phone, String number, String major){
		super(name, age, phone);
		this.number =number;
		this.major = major;
	}

	void study() {
		System.out.println(major + "학문을 공부한다.");
	}

	void exam() {
		System.out.println(number + "학생이 " + major + " 시험을 친다.");
	}
}
