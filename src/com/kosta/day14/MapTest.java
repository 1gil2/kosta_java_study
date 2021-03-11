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
			System.out.println("Ű : " + entry.getKey());
			System.out.println("�� : " + entry.getValue());
			System.out.println();
		}

	}

	private static void method5() {
		Map<String, String> datas = System.getenv();
		for(Entry entry : datas.entrySet()) {
			System.out.println("Ű : " + entry.getKey());
			System.out.println("�� : " + entry.getValue());
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		Properties datas2 = System.getProperties();
		for(Entry entry : datas2.entrySet()) {
			System.out.println("Ű : " + entry.getKey());
			System.out.println("�� : " + entry.getValue());
			System.out.println();
		}
	}

	private static void method4() {
		Properties datas = new Properties();
		datas.put("�ڹ�", "�̰��� �ڹٴ�");
		datas.put("SQL", "SQL����");
		datas.put("HTML", "web����");
		for(Entry entry : datas.entrySet()) {
			System.out.println("Ű : " + entry.getKey());
			System.out.println("�� : " + entry.getValue());
		}
		
	}

	private static void method3() {
		Map<Student, CustomerDTO> datas = new HashMap<Student, CustomerDTO>();
		datas.put(new Student("�л�1", 40, 80), new CustomerDTO(1, "��1", "02-123-1234", ",����"));
		datas.put(new Student("�л�2", 100, 80), new CustomerDTO(2, "��2", "010-123-1234", "�λ�"));
		datas.put(new Student("�л�3", 40, 100), new CustomerDTO(3, "��3", "02-987-1234", "����"));
		
		for(Entry<Student, CustomerDTO> entry :datas.entrySet()) {
			System.out.println("Ű : " + entry.getKey());
			System.out.println("�� : " + entry.getValue());
		}
	}

	private static void method2() {
		Map<String, Integer> datas = new HashMap<String, Integer>();
		datas.put("ȫ�浿", 100);
		datas.put("ȫ�浿", 90); //���� Ű�� �̹� �����ϸ� �����
		datas.put("��浿", 160);
		datas.put("�Ӳ���", 80);
		datas.put("������", 110);
		
		//Ű�� �ִ���?
		System.out.println(datas.containsKey("��浿"));
		System.out.println(datas.containsKey("���ѱ�"));
		//���� �ִ���?
		System.out.println(datas.containsValue(90));
		System.out.println(datas.containsValue(123));
		
		Collection<Integer> scores = datas.values();
		int sum = 0;
		for(Integer score : scores) {
			sum += score;
		}
		System.out.println("������ " + sum);
	}

	private static void method1() {
		//Map interface ���� class : HashMap, TreeMap, Properties ...
		//Ű�� ���� ���̴�.(Map.Entry)
		Map<String, Integer> datas = new HashMap<String, Integer>();
		datas.put("ȫ�浿", 100);
		datas.put("ȫ�浿", 90); //���� Ű�� �̹� �����ϸ� �����
		datas.put("��浿", 160);
		datas.put("�Ӳ���", 80);
		datas.put("������", 110);
		
//		System.out.println(datas);
		
		//Ű�� �̿��ؼ� ���� ��´�.
		Integer val = datas.get("ȫ�浿");
		System.out.println("val = " + val);
		
		//��� Ű�� ���
		Set<String> keys = datas.keySet();
		for(String key : keys) {
			System.out.println(key + " --> " + datas.get(key));
		}
		System.out.println("----------------------------");
		Set<Entry<String, Integer>> entrys = datas.entrySet();
		Iterator<Entry<String, Integer>> it = entrys.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			System.out.println("Ű : " + entry.getKey() + ", �� : " + entry.getValue());
		}
		System.out.println("----------------------------");
		for(Entry<String, Integer> entry : entrys) {
			System.out.println("Ű : " + entry.getKey());
			System.out.println("�� : " + entry.getValue());
		}
		
	}

}
