package com.kosta.day12;

import java.util.Arrays;

public class WildCardExam {

	public static void registerCourse(Course<? extends Student> cc) {
		System.out.println(cc.getName());
		String s = Arrays.toString(cc.getStudents());
	}
	
	public static void main(String[] args) {
		Course<Person> pCourse = new Course<Person>("일반인과정", 5);
		pCourse.add(new Person("일반인"));
		pCourse.add(new Worker("직장인"));
		pCourse.add(new Student("학생"));
		pCourse.add(new HighStudent("고등학생"));
		
		Object[] ps = pCourse.getStudents();
		for(Object p:ps) {
			System.out.println(p);
		}
		
		Course<Worker> wCourse = new Course<Worker>("직장인과정", 5);
	
	}

}
