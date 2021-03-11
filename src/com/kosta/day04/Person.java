package com.kosta.day04;

public class Person {
	static int numberOfPersons;
	int age;
	String name;

	public Person() {
		age = 28;
		name = "���ѱ�";
		numberOfPersons++;
	};

	public Person(int age, String name){
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}

	void selfIntroduce() {
		System.out.println("�� �̸��� " + this.name +"�̸�, ���̴� " + this.age + "�� �Դϴ�.");
	}

	static int getPopulation() {
		return numberOfPersons;
	}
}
