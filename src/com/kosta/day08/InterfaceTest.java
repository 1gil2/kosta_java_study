package com.kosta.day08;

interface SuperInterface{
	void method5();
}

interface A extends SuperInterface{
	void method1();
	void method2();
}

interface B{
	void method3();
	void method4();
}

class ±¸Çöclass implements A, B {

	@Override
	public void method3() {
		System.out.println("3333333");
	}

	@Override
	public void method4() {
		System.out.println("444444444");
	}

	@Override
	public void method1() {
		System.out.println("1111111111111");
	}

	@Override
	public void method2() {
		System.out.println("222");
	}
	
	@Override
	public void method5() {
		System.out.println("55");
	}
	
}



public class InterfaceTest {

	public static void main(String[] args) {
		
	}

}

