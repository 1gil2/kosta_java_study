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
		datas.add(new CustomerDTO(100, "ȫ�浿", "02-123-1234", "����"));
		datas.add(new CustomerDTO(101, "��浿", "02-121-1234", "����"));
		datas.add(new CustomerDTO(102, "�ֱ浿", "02-124-1234", "�λ�"));
		datas.add(new CustomerDTO(103, "�̱浿", "02-125-1234", "�λ�"));
		datas.add(new CustomerDTO(100, "ȫ�浿", "02-123-1234", "����"));
		
		//1, 5 �� ������ 5�� ����. -> CustomerDTO���� hashcode, equals ������ -> 4�� ����.
		for(CustomerDTO cust: datas) {
			System.out.println(cust);
		}
	}

	private static void method5() {
		//Set �������̽��� ������ class : HashSet, TreeSet
		//������ ����, �ߺ��Ұ�, Ű�� ���ȴ�.
		Set<String> datas = new HashSet<String>();
		String[] days = {"��", "ȭ", "��", "��", "��", "��", "��", "��", "ȭ", "ȭ", "ȭ"};
		
		//1.�Ϲ� for�� �б�...�Ұ�
		//2.���� for �б�
		for(String day: days) {
			datas.add(day);
		}
		//3.Iterator �ݺ��� �̿��ؼ� �б�
		Iterator<String> it = datas.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		print(datas);
		System.out.println(datas);
		
	}

	private static void method4() {
		String[] days = {"��", "ȭ", "��", "��", "��", "��", "��"};
	 	List<String> dates = Arrays.asList(days);
//	 	print(dates);
	 	//1.�Ϲ� for �б�...print2
	 	//2.���� for �б�...print
	 	//3.Iterator �ݺ��� �̿��ؼ� �б�
	 	Iterator<String> it = dates.iterator();
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
		
	}

	private static void method3() {
		//List �������̽��� ������ class : Vector
		List<String> datas = new Vector<String>(3);
		String[] days = {"��", "ȭ", "��", "��", "��", "��", "��"};

		for(String day : days) {
			datas.add(day + "����");
		}

		print(datas);


	}

	private static void method2() {
		//List �������̽��� ������ class : LinkedList
		List<String> datas = new LinkedList<String>();
		String[] days = {"��", "ȭ", "��", "��", "��", "��", "��"};

		for(String day : days) {
			datas.add(day + "����");
		}

		print(datas);


	}

	private static void method1() {
		//List �������̽��� ������ class : ArrayList
		List<String> datas = new ArrayList<String>(3);
		String[] days = {"��", "ȭ", "��", "��", "��", "��", "��"};

		for(String day : days) {
			datas.add(day + "����");
		}

		//�Լ�����
		String s = datas.get(4);
		System.out.println("������ " + s);
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
			System.out.println(i + "��° -> " + datas.get(i));
		}
	}
}
