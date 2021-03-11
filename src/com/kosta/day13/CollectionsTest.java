package com.kosta.day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionsTest {

	public static void main(String[] args) {
		method4();

	}

	private static void method4() {
		//Collection과 배열의 차이점 : 여러 타입가능, 갯수가 자동
		//List interface : 순서있음, 중복 혀용
		//구현 class : ArrayList, LinkedList, Vector
		Vector<String> datas = new Vector<String>();

		datas.add("arraylist");
		datas.add("Hello");
		datas.add("HELLO HELLO");		

		System.out.println(datas.size());

		for(String s:datas) {
			System.out.println(s);
		}

	}

	private static void method3() {
		//Collection과 배열의 차이점 : 여러 타입가능, 갯수가 자동
		//List interface : 순서있음, 중복 혀용
		//구현 class : ArrayList, LinkedList, Vector
		ArrayList<String> datas = new ArrayList<String>();

		datas.add("arraylist");
		datas.add("Hello");
		datas.add("HELLO HELLO");		

	}

	private static void method2() {
		//Collection과 배열의 차이점 : 여러 타입가능, 갯수가 자동
		//List interface : 순서있음, 중복 혀용
		//구현 class : ArrayList, LinkedList, Vector
		LinkedList<String> datas = new LinkedList<String>();

		datas.add("arraylist");
		datas.add("Hello");
		datas.add("HELLO HELLO");		

		System.out.println(datas.size());

		for(String s:datas) {
			System.out.println(s);
		}
	}

	private static void method1() {
		//Collection과 배열의 차이점 : 여러 타입가능, 갯수가 자동
		//List interface : 순서있음, 중복 혀용
		//구현 class : ArrayList, LinkedList, Vector


		//강제 타입변환이 필요(단점)
		ArrayList datas = new ArrayList();

		datas.add(100);
		datas.add("arraylist");
		datas.add(2, "Hello");
		datas.add(2, "HELLO HELLO");

	}

}
