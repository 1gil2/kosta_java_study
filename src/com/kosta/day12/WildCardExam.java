package com.kosta.day12;

import java.util.Arrays;

public class WildCardExam {

	public static void registerCourse(Course<? extends Student> cc) {
		System.out.println(cc.getName());
		String s = Arrays.toString(cc.getStudents());
	}
	
	public static void main(String[] args) {
		Course<Person> pCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		pCourse.add(new Person("�Ϲ���"));
		pCourse.add(new Worker("������"));
		pCourse.add(new Student("�л�"));
		pCourse.add(new HighStudent("����л�"));
		
		Object[] ps = pCourse.getStudents();
		for(Object p:ps) {
			System.out.println(p);
		}
		
		Course<Worker> wCourse = new Course<Worker>("�����ΰ���", 5);
	
	}

}
