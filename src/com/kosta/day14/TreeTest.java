package com.kosta.day14;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import com.kosta.day13.model.CustomerDTO;

public class TreeTest {

	public static void main(String[] args) {
		method4();
		
	}

	private static void method4() {
		TreeSet<CustomerDTO> datas = new TreeSet<CustomerDTO>();
		datas.add(new CustomerDTO(1, "고객4", "1234", "서울"));
		datas.add(new CustomerDTO(2, "고객2", "134", "부산"));
		datas.add(new CustomerDTO(3, "고객6", "010", "제주"));
		datas.add(new CustomerDTO(4, "고객1", "1234", "서울"));
		datas.add(new CustomerDTO(4, "고객1", "1234", "서울"));
		
		//asc
		for(CustomerDTO cust: datas) {
			System.out.println(cust);
		}
		System.out.println();
		
		//desc
		NavigableSet<CustomerDTO> descSet = datas.descendingSet();
		for(CustomerDTO cust: descSet) {
			System.out.println(cust);
		}
	}

	private static void method3() {
		TreeSet<CustomerDTO> datas = new TreeSet<CustomerDTO>();
		datas.add(new CustomerDTO(1, "고객4", "1234", "서울"));
		datas.add(new CustomerDTO(2, "고객2", "134", "부산"));
		datas.add(new CustomerDTO(3, "고객6", "010", "제주"));
		datas.add(new CustomerDTO(4, "고객1", "1234", "서울"));
		datas.add(new CustomerDTO(4, "고객1", "1234", "서울"));
		
		//첫번째 item
		System.out.println(datas.first());
		System.out.println();
		//마지막 item
		System.out.println(datas.last());
		System.out.println();
		
		for(CustomerDTO cust: datas) {
			System.out.println(cust);
		}
	}

	private static void method2() {
		// TODO Auto-generated method stub
		Set<String> datas = new TreeSet<String>();
		datas.add("월");
		datas.add("화");
		datas.add("수");
		datas.add("목");
		datas.add("목");
		
		for(String i:datas) {
			System.out.println(i);
		}
	}

	private static void method1() {
		//TreeSet은 값을 넣을때 binary tree이용, 크기비교, 크면 오른쪽, 작으면 왼쪽에 저장
		TreeSet<Integer> datas = new TreeSet<Integer>();
		datas.add(100);
		datas.add(50);
		datas.add(70);
		datas.add(30);
		datas.add(30);
		
		System.out.println(datas.first());
		System.out.println(datas.last());
		System.out.println();
		
		//기분보다 작은 item
		System.out.println(datas.lower(50));
		System.out.println();
		//기분보다 큰 item
		System.out.println(datas.higher(50));
		System.out.println();
		
		//동등하거나 작은
		System.out.println(datas.floor(50));
		System.out.println();
		
		//동등하거나 큰
		System.out.println(datas.ceiling(50));
		System.out.println();
		
		for(Integer i:datas) {
			System.out.println(i);
		}
	}

}
