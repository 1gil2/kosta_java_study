package com.kosta.day14;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;

import com.kosta.day13.model.CustomerDTO;

public class TreeTest2 {
	
	public static void main(String[] args) {
		method2();
	
	}

	private static void method2() {
		//HashMap -> hashcode(), equals() ����
		TreeMap<Car, CustomerDTO> datas = new TreeMap<Car, CustomerDTO>(); //compareTo 
		datas.put(new Car("ABC", 6000), new CustomerDTO(100, "��1", "123", "����"));
		datas.put(new Car("�Ÿ", 3000), new CustomerDTO(100, "��1", "123", "����"));
		datas.put(new Car("�׷���", 7000), new CustomerDTO(100, "��1", "123", "����"));
		datas.put(new Car("ABC", 1000), new CustomerDTO(100, "��1", "123", "����"));
		
		for(Entry<Car, CustomerDTO> entry : datas.entrySet()) {
			System.out.println("Ű : " + entry.getKey());
			System.out.println("�� : " + entry.getValue());
		}
	
	 	NavigableMap<Car, CustomerDTO> desc = datas.descendingMap();
	 	
	}

	private static void method1() {
		Map<String, Integer> datas = new TreeMap<String, Integer>();
		datas.put("ȫ�浿", 100);
		datas.put("ȫ�浿", 90);
		datas.put("��浿", 160);
		datas.put("�Ӳ���", 80);
		datas.put("������", 110);
		
		System.out.println(datas);
	}

}
