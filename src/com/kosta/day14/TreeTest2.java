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
		//HashMap -> hashcode(), equals() ±¸Çö
		TreeMap<Car, CustomerDTO> datas = new TreeMap<Car, CustomerDTO>(); //compareTo 
		datas.put(new Car("ABC", 6000), new CustomerDTO(100, "°í°´1", "123", "¼­¿ï"));
		datas.put(new Car("½î³ªÅ¸", 3000), new CustomerDTO(100, "°í°´1", "123", "¼­¿ï"));
		datas.put(new Car("±×·£Á®", 7000), new CustomerDTO(100, "°í°´1", "123", "¼­¿ï"));
		datas.put(new Car("ABC", 1000), new CustomerDTO(100, "°í°´1", "123", "¼­¿ï"));
		
		for(Entry<Car, CustomerDTO> entry : datas.entrySet()) {
			System.out.println("Å° : " + entry.getKey());
			System.out.println("°ª : " + entry.getValue());
		}
	
	 	NavigableMap<Car, CustomerDTO> desc = datas.descendingMap();
	 	
	}

	private static void method1() {
		Map<String, Integer> datas = new TreeMap<String, Integer>();
		datas.put("È«±æµ¿", 100);
		datas.put("È«±æµ¿", 90);
		datas.put("±è±æµ¿", 160);
		datas.put("ÀÓ²©Á¤", 80);
		datas.put("ÀÏÁö¸Å", 110);
		
		System.out.println(datas);
	}

}
