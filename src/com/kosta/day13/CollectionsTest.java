package com.kosta.day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionsTest {

	public static void main(String[] args) {
		method4();

	}

	private static void method4() {
		//Collection�� �迭�� ������ : ���� Ÿ�԰���, ������ �ڵ�
		//List interface : ��������, �ߺ� ����
		//���� class : ArrayList, LinkedList, Vector
		Vector<String> datas = new Vector<String>();

		datas.add("arraylist");
		datas.add("Hello");
		datas.add("HELLO HELLO");		

		System.out.println(datas.size());

		for(String s:datas) {
			System.out.println(s);
		}

	}

	private static void method3() {
		//Collection�� �迭�� ������ : ���� Ÿ�԰���, ������ �ڵ�
		//List interface : ��������, �ߺ� ����
		//���� class : ArrayList, LinkedList, Vector
		ArrayList<String> datas = new ArrayList<String>();

		datas.add("arraylist");
		datas.add("Hello");
		datas.add("HELLO HELLO");		

	}

	private static void method2() {
		//Collection�� �迭�� ������ : ���� Ÿ�԰���, ������ �ڵ�
		//List interface : ��������, �ߺ� ����
		//���� class : ArrayList, LinkedList, Vector
		LinkedList<String> datas = new LinkedList<String>();

		datas.add("arraylist");
		datas.add("Hello");
		datas.add("HELLO HELLO");		

		System.out.println(datas.size());

		for(String s:datas) {
			System.out.println(s);
		}
	}

	private static void method1() {
		//Collection�� �迭�� ������ : ���� Ÿ�԰���, ������ �ڵ�
		//List interface : ��������, �ߺ� ����
		//���� class : ArrayList, LinkedList, Vector


		//���� Ÿ�Ժ�ȯ�� �ʿ�(����)
		ArrayList datas = new ArrayList();

		datas.add(100);
		datas.add("arraylist");
		datas.add(2, "Hello");
		datas.add(2, "HELLO HELLO");

	}

}
