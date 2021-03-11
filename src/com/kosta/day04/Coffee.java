package com.kosta.day04;

public class Coffee {
	String name;
	int cost;
	
	Coffee(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	void print() {
		System.out.println(name + "은 " + cost + "원 입니다.");
	}
}
