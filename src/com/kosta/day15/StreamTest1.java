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
				new Student("ȫ�浿", 100),
				new Student("�ſ��", 82),
				new Student("���ڹ�", 90)
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
				new Student("ȫ�浿", 100),
				new Student("�ſ��", 80),
				new Student("���ڹ�", 90)
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
		String[] arr = new String[] {"ȫ�浿", "�ſ��", "���ڹ�"};
		List<String> alist = Arrays.asList(arr);

		//�ݺ��ڸ� �������
		Iterator<String> it = alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		//�ݺ��ڸ� ���For�̿�
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
