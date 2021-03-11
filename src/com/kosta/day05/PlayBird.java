package com.kosta.day05;

class Sparrow {
	String name;
	static int legs = 2;
	int length;
	
	void fly() {
		System.out.println("����(" + name + ")�� ���ƴٴմϴ�.");
	}

	void sing() {
		System.out.println("����(" + name + ")�� �Ҹ����� ��ϴ�.");
	}
	
	void toMyString() {
		System.out.println("������ �̸��� " + name + " �Դϴ�.");
	}
	
	void setName(String name) {
		this.name = name;
	}
}


class Duck {
	String name;
	static int legs = 2;
	int length;
	

	void fly() {
		System.out.println("����(" + name + ")�� ���� �ʽ��ϴ�.");
	}
	
	void sing() {
		System.out.println("����(" + name + ")�� �Ҹ����� ��ϴ�.");
	}
	
	void toMyString() {
		System.out.println("������ �̸��� " + name + " �Դϴ�.");
	}
	
	void setName(String name) {
		this.name = name;
	}
}

public class PlayBird {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d = new Duck();
		Sparrow s = new Sparrow();
		
		d.setName("�в���");
		s.setName("±±");
		d.fly();
		d.sing();
		d.toMyString();
		s.fly();
		s.sing();
		s.toMyString();

	}

}
