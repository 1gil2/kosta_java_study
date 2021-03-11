package com.kosta.day06.inherit;

public class StudentTest {
	public static void main(String[] args) {
		Person p1 = new Person("한길", 28, "010-8640");
		Student s1 = new Student("최", 30, "5078", "20141368", "수학");
		
		p1.eat();
		p1.play();
		s1.eat();
		s1.play();
		s1.study();
		s1.exam();
		
	}
}
