package com.kosta.day04;

public class Person {
	static int numberOfPersons;
	int age;
	String name;

	public Person() {
		age = 28;
		name = "최한길";
		numberOfPersons++;
	};

	public Person(int age, String name){
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}

	void selfIntroduce() {
		System.out.println("내 이름은 " + this.name +"이며, 나이는 " + this.age + "살 입니다.");
	}

	static int getPopulation() {
		return numberOfPersons;
	}
}
