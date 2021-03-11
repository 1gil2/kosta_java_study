package com.kosta.day04;

public class StudentTest {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		Student s1 = new Student();
		System.out.println(s1.name);
		
		Student s2 = new Student("최한길", 123, "수학", 28);
		Student s4 = new Student("고석우", 22);
	}
	
}
