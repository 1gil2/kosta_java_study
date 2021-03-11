package com.kosta.day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Set;

import com.kosta.day13.LambdaExample.Student;
import com.kosta.day13.model.CustomerDTO;

public class MapTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		method6();

	}

	private static void method6() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		String fname = "src/com/kosta/day14/oracleinfo.properties";
		pro.load(new FileReader(fname));

		for(Entry entry : pro.entrySet()) {
			System.out.println("키 : " + entry.getKey());
			System.out.println("값 : " + entry.getValue());
			System.out.println();
		}

	}

	private static void method5() {
		Map<String, String> datas = System.getenv();
		for(Entry entry : datas.entrySet()) {
			System.out.println("키 : " + entry.getKey());
			System.out.println("값 : " + entry.getValue());
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		Properties datas2 = System.getProperties();
		for(Entry entry : datas2.entrySet()) {
			System.out.println("키 : " + entry.getKey());
			System.out.println("값 : " + entry.getValue());
			System.out.println();
		}
	}

	private static void method4() {
		Properties datas = new Properties();
		datas.put("자바", "이것이 자바다");
		datas.put("SQL", "SQL정복");
		datas.put("HTML", "web정복");
		for(Entry entry : datas.entrySet()) {
			System.out.println("키 : " + entry.getKey());
			System.out.println("값 : " + entry.getValue());
		}
		
	}

	private static void method3() {
		Map<Student, CustomerDTO> datas = new HashMap<Student, CustomerDTO>();
		datas.put(new Student("학생1", 40, 80), new CustomerDTO(1, "고객1", "02-123-1234", ",서울"));
		datas.put(new Student("학생2", 100, 80), new CustomerDTO(2, "고객2", "010-123-1234", "부산"));
		datas.put(new Student("학생3", 40, 100), new CustomerDTO(3, "고객3", "02-987-1234", "서울"));
		
		for(Entry<Student, CustomerDTO> entry :datas.entrySet()) {
			System.out.println("키 : " + entry.getKey());
			System.out.println("값 : " + entry.getValue());
		}
	}

	private static void method2() {
		Map<String, Integer> datas = new HashMap<String, Integer>();
		datas.put("홍길동", 100);
		datas.put("홍길동", 90); //같은 키가 이미 존재하며 덮어쓰기
		datas.put("김길동", 160);
		datas.put("임꺽정", 80);
		datas.put("일지매", 110);
		
		//키가 있는지?
		System.out.println(datas.containsKey("김길동"));
		System.out.println(datas.containsKey("최한길"));
		//값이 있는지?
		System.out.println(datas.containsValue(90));
		System.out.println(datas.containsValue(123));
		
		Collection<Integer> scores = datas.values();
		int sum = 0;
		for(Integer score : scores) {
			sum += score;
		}
		System.out.println("총점은 " + sum);
	}

	private static void method1() {
		//Map interface 구현 class : HashMap, TreeMap, Properties ...
		//키와 값의 쌍이다.(Map.Entry)
		Map<String, Integer> datas = new HashMap<String, Integer>();
		datas.put("홍길동", 100);
		datas.put("홍길동", 90); //같은 키가 이미 존재하며 덮어쓰기
		datas.put("김길동", 160);
		datas.put("임꺽정", 80);
		datas.put("일지매", 110);
		
//		System.out.println(datas);
		
		//키를 이용해서 값을 얻는다.
		Integer val = datas.get("홍길동");
		System.out.println("val = " + val);
		
		//모든 키를 얻기
		Set<String> keys = datas.keySet();
		for(String key : keys) {
			System.out.println(key + " --> " + datas.get(key));
		}
		System.out.println("----------------------------");
		Set<Entry<String, Integer>> entrys = datas.entrySet();
		Iterator<Entry<String, Integer>> it = entrys.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
		}
		System.out.println("----------------------------");
		for(Entry<String, Integer> entry : entrys) {
			System.out.println("키 : " + entry.getKey());
			System.out.println("값 : " + entry.getValue());
		}
		
	}

}
