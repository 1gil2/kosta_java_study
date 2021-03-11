package com.kosta.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		method5();

	}

	private static void method5() {
		
		
	}

	private static void method4() {
		Student[] arr = {
				new Student("홍길동", 100),
				new Student("신용권", 82),
				new Student("김자바", 90)
				};
		List<Student> alist = Arrays.asList(arr);
		double avg = alist.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
	}

	private static void method3() {
		Student[] arr = {
				new Student("홍길동", 100),
				new Student("신용권", 80),
				new Student("김자바", 90)
				};
		List<Student> alist = Arrays.asList(arr);
		Stream<Student> st = alist.stream();
		
		Consumer<Student> consumer = stu -> System.out.println(stu);
		st.forEach(consumer);
		
	}

	private static void method2() {
		Integer[] arr = {100, 50, 20, 100, 70};
		List<Integer> alist = Arrays.asList(arr);
		Stream<Integer> st = alist.stream();
		
		Consumer<Integer> consumer = i -> System.out.println(i);
		st.forEach(consumer);
	}

	private static void method1() {
		String[] arr = new String[] {"홍길동", "신용권", "김자바"};
		List<String> alist = Arrays.asList(arr);

		//반복자를 직접사용
		Iterator<String> it = alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		//반복자를 향상For이용
		for(String s : alist) {
			System.out.println(s);
		}
		System.out.println();
		
		//
		Stream<String> st = alist.stream();
		st.forEach(s -> System.out.println(s));
		System.out.println();
		
		//
		Consumer<String> consumer = s->System.out.println(s);
		for(String ss : alist) {
			consumer.accept(ss);
		}
	}

}
