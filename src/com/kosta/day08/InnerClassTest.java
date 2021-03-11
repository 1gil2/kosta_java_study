package com.kosta.day08;

public class InnerClassTest {

	public static void method1() {
		//instance inner class
		OuterClass.InnerClass inner;

		inner = new OuterClass().new InnerClass();

		System.out.println(inner.a);
		inner.test();
	}

	public static void method2() {
		//static inner class
		System.out.println(OuterClass.StaticInnerClass.grade);
		OuterClass.StaticInnerClass.printGrade();
		
		OuterClass.StaticInnerClass staticClass = 
				new OuterClass.StaticInnerClass();
		
		System.out.println(staticClass.score);
		staticClass.printScore();
	}
	
	public static void method3() {
		OuterClass outter = new OuterClass();
		outter.test("asdf");
	}
	
	public static void main(String[] args) {
		method3();
	}
}
