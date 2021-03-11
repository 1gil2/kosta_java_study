package com.kosta.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import com.kosta.day13.model.CustomerDTO;

public class CollectionTest {

	public static void main(String[] args) {
		method6();

	}

	private static void method6() {
		Set<CustomerDTO> datas = new HashSet<CustomerDTO>();
		datas.add(new CustomerDTO(100, "홍길동", "02-123-1234", "서울"));
		datas.add(new CustomerDTO(101, "김길동", "02-121-1234", "서울"));
		datas.add(new CustomerDTO(102, "최길동", "02-124-1234", "부산"));
		datas.add(new CustomerDTO(103, "이길동", "02-125-1234", "부산"));
		datas.add(new CustomerDTO(100, "홍길동", "02-123-1234", "서울"));
		
		//1, 5 가 같은데 5개 나옴. -> CustomerDTO에서 hashcode, equals 재정의 -> 4개 나옴.
		for(CustomerDTO cust: datas) {
			System.out.println(cust);
		}
	}

	private static void method5() {
		//Set 인터페이스를 구현한 class : HashSet, TreeSet
		//순서가 없다, 중복불가, 키로 사용된다.
		Set<String> datas = new HashSet<String>();
		String[] days = {"월", "화", "수", "목", "금", "토", "일", "월", "화", "화", "화"};
		
		//1.일반 for로 읽기...불가
		//2.향상된 for 읽기
		for(String day: days) {
			datas.add(day);
		}
		//3.Iterator 반복자 이용해서 읽기
		Iterator<String> it = datas.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		print(datas);
		System.out.println(datas);
		
	}

	private static void method4() {
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
	 	List<String> dates = Arrays.asList(days);
//	 	print(dates);
	 	//1.일반 for 읽기...print2
	 	//2.향상된 for 읽기...print
	 	//3.Iterator 반복자 이용해서 읽기
	 	Iterator<String> it = dates.iterator();
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
		
	}

	private static void method3() {
		//List 인터페이스를 구현한 class : Vector
		List<String> datas = new Vector<String>(3);
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};

		for(String day : days) {
			datas.add(day + "요일");
		}

		print(datas);


	}

	private static void method2() {
		//List 인터페이스를 구현한 class : LinkedList
		List<String> datas = new LinkedList<String>();
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};

		for(String day : days) {
			datas.add(day + "요일");
		}

		print(datas);


	}

	private static void method1() {
		//List 인터페이스를 구현한 class : ArrayList
		List<String> datas = new ArrayList<String>(3);
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};

		for(String day : days) {
			datas.add(day + "요일");
		}

		//함수연습
		String s = datas.get(4);
		System.out.println("오늘은 " + s);
//		datas.clear();
		datas.contains(s);
		
		print2(datas);

	}

	private static void print(Set<String> datas) {
		for(String data: datas) {
			System.out.println(data);
		}
	}
	
	private static void print(List<String> datas) {
		for(String data: datas) {
			System.out.println(data);
		}
	}
	
	private static void print2(List<String> datas) {
		for(int i = 0 ; i < datas.size(); i++) {
			System.out.println(i + "번째 -> " + datas.get(i));
		}
	}
}
