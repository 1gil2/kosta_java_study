package com.kosta.day12.review;

import com.kosta.day12.Person;

public class Course<T> {
	private String courseName;
	private T[] students;
	private int i = 0;
	
	public Course(String courseName, int capacity) {
		super();
		this.courseName = courseName;
		this.students = (T[]) new Object[capacity];
		//배열생성
	}

	public String getCourseName() {
		return courseName;
	}

	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		students[i++] = t;
	}

}
