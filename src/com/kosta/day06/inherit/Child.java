package com.kosta.day06.inherit;

//�ڽ��� �θ� �����Ѵ�.
public class Child extends Parent{

	int b = 20;
	
	public Child() {
		//super(); �ڵ����� �θ����
		System.out.println("�ڽ��� ������");
	}
	
	void parentPrint() {
		System.out.println("a = " + a);
		method1();
	}
	
	void method1() {
		System.out.println("������");
	}

}
