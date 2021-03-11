package com.kosta.day11;

public class Bathroom {

	public synchronized void use(String name) {
		System.out.println("=============");
		System.out.println(name + "입장합니다.");
		System.out.println(name + "사용합니다.");
		System.out.println(name + "퇴장합니다.");
	}

}
