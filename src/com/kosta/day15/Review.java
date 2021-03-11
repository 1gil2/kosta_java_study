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
		datas.put(new Student("ȫ�浿", 50), 80);
		
	}

	private static void method3() {
		Map<Student, Integer> datas = new HashMap<Student, Integer>();
		datas.put(new Student("ȫ�浿", 50), 80);
		
	}

	private static void method2() {
		TreeSet<Student> datas = new TreeSet<Student>();
		datas.add(new Student("ȫ�浿", 50));
		datas.add(new Student("��浿", 100));
		datas.add(new Student("�ڱ浿", 50));
		datas.add(new Student("���浿", 90));
		datas.add(new Student("�̱浿", 60));
		
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
		//List : ����, �ߺ� ...ArrayList, LinkedList, Vector
		//Set : ����X, �ߺ�X, Key�� ��� ...HashSet, TreeSet
		//Map : key, value�� �� (entry) ...HashMap, TreeMap, Properties
		//Stack(LIFO) class, Queue(FIFO) interface

	}

}
