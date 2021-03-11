package com.kosta.day04;

public class OverloadingTest {

	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void sum(String a, String b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		sum(10, 20);
		sum("자바", "프로그램");
		sum(10.1, 20.2);
		
		
	}

}
