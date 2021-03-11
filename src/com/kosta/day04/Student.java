package com.kosta.day04;

public class Student {
	String name;
	int no;
	String major;
	int age;
	
	Student() {
		System.out.println("기본생성자");
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
		System.out.println(name + "학생이 공부한다.");
	}
	String getMajor() {
		return name + "학생의 전공은 " + major;
	}
	
	int getAge() {
		return age;
	}
}
