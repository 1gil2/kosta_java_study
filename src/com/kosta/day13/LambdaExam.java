package com.kosta.day13;

//1. interface ���� class �����
class MyRunnableimpl extends Object implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}	
	}	
}

//���� ǥ�������� ����� �������� ������ �ܰ迡�� üũ�ϴ� ������̼�
@FunctionalInterface
interface MyInterface {
	//public abstract ���� ����
	//void myFunction();
	public abstract void myFunction();
}
//1. ���� class �����
class MyInterfaceImpl implements MyInterface{

	@Override
	public void myFunction() {
		System.out.println("interface ���� class");
	}
	
}

public class LambdaExam {

	public static void main(String[] args) {
		method7();

	}

	private static void method7() {
		//3. Lambda ǥ���� ����ϱ�
		MyInterface a = ()->{
			System.out.println("Lambda ǥ���� ����ϱ�");
		};
		a.myFunction();
	}

	private static void method6() {
		//2.�͸�class�����
		(new MyInterface() {

			@Override
			public void myFunction() {
				System.out.println("�͸�class�����");
			}
			
		}).myFunction();
		
	}

	private static void method5() {
		MyInterface a = new MyInterfaceImpl();
		a.myFunction();
		
	}

	private static void method3() {
		//3. Lambda ǥ����
		Runnable a = () -> {
			for(int i = 11; i <= 15; i++) {
				System.out.println(i);
			}
		};
				
		Thread t = new Thread(a);
		t.start();
		System.out.println("method3 ��");

	}

	private static void method2() {
		//2. �͸� class ���
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
		System.out.println("method2 ��");
	}

	private static void method1() {
		MyRunnableimpl a = new MyRunnableimpl();
		Thread t = new Thread(a);
		t.start();
		System.out.println("method1 ��");
	}

}
