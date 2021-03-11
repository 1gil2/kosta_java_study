package com.kosta.day12.review;

import java.util.Arrays;

import com.kosta.day12.HighStudent;
import com.kosta.day12.Person;
import com.kosta.day12.Student;
import com.kosta.day12.Worker;

public class WildCardTest {
	
	public static void main(String[] args) {
		Course<Person> a = makePerson();
		Course<Student> b = makeStudent();
		Course<HighStudent> c = makeHighStudent();
		Course<Worker> d = makeWorker();
		
		registerPerson(a);
		registerPerson(b);
//		registerPerson(c);
//		registerPerson(d);
	}
	
	//extends, super
	private static void registerPerson(Course<? super Student> cc) {
		System.out.println(cc.getCourseName());
		String s = Arrays.toString(cc.getStudents());
		System.out.println(s);
		System.out.println("----------------------");
	}
	
	private static Course<Worker> makeWorker() {
		Course<Worker> pCourse = new Course<Worker>("일반인과정", 5);
//		pCourse.add(new Person("일반인1"));
//		pCourse.add(new Student("학생1"));
//		pCourse.add(new HighStudent("고등학생1"));
		pCourse.add(new Worker("직장인1"));
		
		return pCourse;
		
	}
	
	private static Course<HighStudent> makeHighStudent() {
		Course<HighStudent> pCourse = new Course<HighStudent>("일반인과정", 5);
//		pCourse.add(new Person("일반인1"));
//		pCourse.add(new Student("학생1"));
		pCourse.add(new HighStudent("고등학생1"));
//		pCourse.add(new Worker("직장인1"));
		
		return pCourse;
		
	}

	private static Course<Person> makePerson() {
		Course<Person> pCourse = new Course<Person>("일반인과정", 5);
		pCourse.add(new Person("일반인1"));
		pCourse.add(new Student("학생1"));
		pCourse.add(new HighStudent("고등학생1"));
		pCourse.add(new Worker("직장인1"));
		
		return pCourse;
//		String s = Arrays.toString(pCourse.getStudents());
//		System.out.println(s);
		
	}

	private static Course<Student> makeStudent() {
		Course<Student> pCourse = new Course<Student>("일반인과정", 5);
//		pCourse.add(new Person("일반인1"));
		pCourse.add(new Student("학생1"));
		pCourse.add(new HighStudent("고등학생1"));
//		pCourse.add(new Worker("직장인1"));
		
		return pCourse;
		
	}
}
