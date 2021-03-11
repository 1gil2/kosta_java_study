package com.kosta.day13;

//lambda : 익명클래스를 함수형으로 바꾼 것

interface Arg1{
	void print(int num);
}

interface Arg2{
	int print(int num, int num2);
}

public class LambdaExam2 {

	public static void main(String[] args) {
		method2();

	}

	private static void method2() {
		Arg2 a = (int x, int y) -> {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			return x+y;
		};
		System.out.println(a.print(3, 6));
		
	}

	private static void method1() {
		Arg1 a = (int su) -> {
			System.out.println(su+10);
			System.out.println(su-10);
		};
		a.print(5);

	}

}
