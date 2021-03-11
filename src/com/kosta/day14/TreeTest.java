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
		datas.add(new CustomerDTO(1, "��4", "1234", "����"));
		datas.add(new CustomerDTO(2, "��2", "134", "�λ�"));
		datas.add(new CustomerDTO(3, "��6", "010", "����"));
		datas.add(new CustomerDTO(4, "��1", "1234", "����"));
		datas.add(new CustomerDTO(4, "��1", "1234", "����"));
		
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
		datas.add(new CustomerDTO(1, "��4", "1234", "����"));
		datas.add(new CustomerDTO(2, "��2", "134", "�λ�"));
		datas.add(new CustomerDTO(3, "��6", "010", "����"));
		datas.add(new CustomerDTO(4, "��1", "1234", "����"));
		datas.add(new CustomerDTO(4, "��1", "1234", "����"));
		
		//ù��° item
		System.out.println(datas.first());
		System.out.println();
		//������ item
		System.out.println(datas.last());
		System.out.println();
		
		for(CustomerDTO cust: datas) {
			System.out.println(cust);
		}
	}

	private static void method2() {
		// TODO Auto-generated method stub
		Set<String> datas = new TreeSet<String>();
		datas.add("��");
		datas.add("ȭ");
		datas.add("��");
		datas.add("��");
		datas.add("��");
		
		for(String i:datas) {
			System.out.println(i);
		}
	}

	private static void method1() {
		//TreeSet�� ���� ������ binary tree�̿�, ũ���, ũ�� ������, ������ ���ʿ� ����
		TreeSet<Integer> datas = new TreeSet<Integer>();
		datas.add(100);
		datas.add(50);
		datas.add(70);
		datas.add(30);
		datas.add(30);
		
		System.out.println(datas.first());
		System.out.println(datas.last());
		System.out.println();
		
		//��к��� ���� item
		System.out.println(datas.lower(50));
		System.out.println();
		//��к��� ū item
		System.out.println(datas.higher(50));
		System.out.println();
		
		//�����ϰų� ����
		System.out.println(datas.floor(50));
		System.out.println();
		
		//�����ϰų� ū
		System.out.println(datas.ceiling(50));
		System.out.println();
		
		for(Integer i:datas) {
			System.out.println(i);
		}
	}

}
