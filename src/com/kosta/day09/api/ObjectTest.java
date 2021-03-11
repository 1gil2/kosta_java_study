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
		// Set : key�� ���ȴ�. �ߺ��ȵ�, ��������
		Set<String> shopping = new HashSet<>();
		shopping.add("���");
		shopping.add("�ٳ���");
		shopping.add("������");
		shopping.add("���");
		shopping.add("���");	
		for(String s:shopping) {
			System.out.println(s);
		}
		String s1 = new String("���");
		String s2 = new String("���");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

	private static void method2() {
		String s1 = new String("�ڹ�");
		String s2 = new String("�ڹ�");
		String s3 = "�ڹ�";
		String s4 = "�ڹ�";
		
		System.out.println(s1 == s2); //�ּ� �ٸ���
		System.out.println(s1.equals(s2)); //���� ����
		System.out.println(s3 == s4); //�ּ� ����
		System.out.println(s3.equals(s4)); //���� ����
		System.out.println(s1 == s3); //�ּ� �ٸ���
		System.out.println(s1.equals(s3)); //���� ����
		
	}

	private static void method1() {
		
		int a1 = 10;
		int a2 = 10;
		
		System.out.println(a1 == a2); //�⺻���� �� ��
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1 == obj2); //��ü�� �ּ� ��
		System.out.println(obj1.equals(obj2)); //��ü�� �ּ� ��
		
		Integer a3 = 10;
		Integer a4 = 10;
		Integer a5 = new Integer(10);
		Integer a6 = new Integer(10);
		System.out.println(a5 == a6); //���ͷ��̶� ��ü�� ���� ��, �ּ� ��
		System.out.println(a5.equals(a6)); //�� ��
		//Object : == �ּҺ�, equals �ּҺ�
		//Integer :  
		//String : 
	}
	
}
