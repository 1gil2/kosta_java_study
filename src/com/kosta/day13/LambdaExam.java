package com.kosta.day13;

//1. interface 구현 class 만들기
class MyRunnableimpl extends Object implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}	
	}	
}

//람다 표현식으로 사용이 가능한지 컴파일 단계에서 체크하는 어노테이션
@FunctionalInterface
interface MyInterface {
	//public abstract 생략 가능
	//void myFunction();
	public abstract void myFunction();
}
//1. 구현 class 만들기
class MyInterfaceImpl implements MyInterface{

	@Override
	public void myFunction() {
		System.out.println("interface 구현 class");
	}
	
}

public class LambdaExam {

	public static void main(String[] args) {
		method7();

	}

	private static void method7() {
		//3. Lambda 표현식 사용하기
		MyInterface a = ()->{
			System.out.println("Lambda 표현식 사용하기");
		};
		a.myFunction();
	}

	private static void method6() {
		//2.익명class만들기
		(new MyInterface() {

			@Override
			public void myFunction() {
				System.out.println("익명class만들기");
			}
			
		}).myFunction();
		
	}

	private static void method5() {
		MyInterface a = new MyInterfaceImpl();
		a.myFunction();
		
	}

	private static void method3() {
		//3. Lambda 표현식
		Runnable a = () -> {
			for(int i = 11; i <= 15; i++) {
				System.out.println(i);
			}
		};
				
		Thread t = new Thread(a);
		t.start();
		System.out.println("method3 끝");

	}

	private static void method2() {
		//2. 익명 class 사용
		Runnable a = new Runnable() {

			@Override
			public void run() {
				for(int i = 11; i <= 15; i++) {
					System.out.println(i);
				}
			}
		};
		Thread t = new Thread(a);
		t.start();
		System.out.println("method2 끝");
	}

	private static void method1() {
		MyRunnableimpl a = new MyRunnableimpl();
		Thread t = new Thread(a);
		t.start();
		System.out.println("method1 끝");
	}

}
