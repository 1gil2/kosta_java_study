package com.kosta.day04;

public class CarTest {

	public static void main(String[] args) {
		//1. 객체참조변수선언
		int[] arr;
		String st1;
		Car c1;
		
		//2. 객체생성
		arr = new int[5];
		c1 = new Car();		
		st1 = new String("자바");
		
		//3. 객체사용
		arr[0] = 300;
		System.out.println(st1.charAt(0));
	}

}
