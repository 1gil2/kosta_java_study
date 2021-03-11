package com.kosta.day09.api;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest {

	public static void main(String[] args) {

		method7();
		
	}

	private static void method7() {
		// TODO Auto-generated method stub
		
	}

	private static void method6() {
		// Collection : List, Set, Map
		// Set : key로 사용된다. 중복안됨, 순서없음
		Set<String> shopping = new HashSet<>();
		shopping.add("사과");
		shopping.add("바나나");
		shopping.add("오렌지");
		shopping.add("사과");
		shopping.add("사과");	
		for(String s:shopping) {
			System.out.println(s);
		}
		String s1 = new String("사과");
		String s2 = new String("사과");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

	private static void method2() {
		String s1 = new String("자바");
		String s2 = new String("자바");
		String s3 = "자바";
		String s4 = "자바";
		
		System.out.println(s1 == s2); //주소 다르다
		System.out.println(s1.equals(s2)); //내용 같다
		System.out.println(s3 == s4); //주소 같다
		System.out.println(s3.equals(s4)); //내용 같다
		System.out.println(s1 == s3); //주소 다르다
		System.out.println(s1.equals(s3)); //내용 같다
		
	}

	private static void method1() {
		
		int a1 = 10;
		int a2 = 10;
		
		System.out.println(a1 == a2); //기본형은 값 비교
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1 == obj2); //객체는 주소 비교
		System.out.println(obj1.equals(obj2)); //객체는 주소 비교
		
		Integer a3 = 10;
		Integer a4 = 10;
		Integer a5 = new Integer(10);
		Integer a6 = new Integer(10);
		System.out.println(a5 == a6); //리터럴이라 객체를 같이 씀, 주소 비교
		System.out.println(a5.equals(a6)); //값 비교
		//Object : == 주소비교, equals 주소비교
		//Integer :  
		//String : 
	}
	
}
