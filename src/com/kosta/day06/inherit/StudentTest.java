package com.kosta.day06.inherit;

public class StudentTest {
	public static void main(String[] args) {
		Person p1 = new Person("�ѱ�", 28, "010-8640");
		Student s1 = new Student("��", 30, "5078", "20141368", "����");
		
		p1.eat();
		p1.play();
		s1.eat();
		s1.play();
		s1.study();
		s1.exam();
		
	}
}
