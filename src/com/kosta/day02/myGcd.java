package com.kosta.day02;

public class myGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcd(2, 5);
		gcd(5, 15);
		gcd(250, 30);

	}
	
	public static void gcd(int a, int b) {
		int x = a;
		int y = b;
		int temp;
		while (y > 0) {
			temp = y;
			y = x%temp;
			x = temp;
		}
		
		System.out.println("gcd("+a+", "+ b + ") = " + x);
	}

}
