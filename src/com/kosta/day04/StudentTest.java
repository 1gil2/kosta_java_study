package com.kosta.day04;

public class StudentTest {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		Student s1 = new Student();
		System.out.println(s1.name);
		
		Student s2 = new Student("���ѱ�", 123, "����", 28);
		Student s4 = new Student("����", 22);
	}
	
}
