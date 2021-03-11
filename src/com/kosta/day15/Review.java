package com.kosta.day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Review {
	public static void main(String[] args) {
		method4();
		
	}

	private static void method4() {
		Map<Student, Integer> datas = new TreeMap<Student, Integer>();
		datas.put(new Student("홍길동", 50), 80);
		
	}

	private static void method3() {
		Map<Student, Integer> datas = new HashMap<Student, Integer>();
		datas.put(new Student("홍길동", 50), 80);
		
	}

	private static void method2() {
		TreeSet<Student> datas = new TreeSet<Student>();
		datas.add(new Student("홍길동", 50));
		datas.add(new Student("김길동", 100));
		datas.add(new Student("박길동", 50));
		datas.add(new Student("정길동", 90));
		datas.add(new Student("이길동", 60));
		
		for(Student s : datas) {
			System.out.println(s);
		}
		System.out.println();
		
		for(Student s : datas.descendingSet()) {
			System.out.println(s);
		}
		
	}

	private static void method1() {
		//Collection : List, Set, Map
		//List : 순서, 중복 ...ArrayList, LinkedList, Vector
		//Set : 순서X, 중복X, Key로 사용 ...HashSet, TreeSet
		//Map : key, value의 쌍 (entry) ...HashMap, TreeMap, Properties
		//Stack(LIFO) class, Queue(FIFO) interface

	}

}
