package com.kosta.day11;

public class Bathroom {

	public synchronized void use(String name) {
		System.out.println("=============");
		System.out.println(name + "�����մϴ�.");
		System.out.println(name + "����մϴ�.");
		System.out.println(name + "�����մϴ�.");
	}

}
