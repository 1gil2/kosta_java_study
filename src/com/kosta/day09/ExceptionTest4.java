package com.kosta.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//���ܹ߻�
//1. �ڵ�...����� �ڵ�, �����Ͻ� �ݵ��
//2. �����߻�...throw �����̸�
//����ó��
//1. ���� �Ѵ�. : try - catch - finally
//2. (���� ȣ���� ������) ���ѱ��. : throws

public class ExceptionTest4 {

	public static void main(String[] args) {
		try {
			method6();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.message2);
			e.print();
		}
		System.out.println("main end");
	}

	private static void method6() throws MyException {
		System.out.println("method start");
		int score = 70;
		if(score <= 70) throw new MyException("70�̻󸸰���");
		System.out.println("method end");
	}

	private static void method5() throws IOException {
		int score = 70;
		if(score <= 70) throw new IOException("70�̻󸸰���");
		//���ܸ� ����Ű�� ó���� ��������. ���α׷��ߴܵ�
		System.out.println("method5 end");
		
	}

	private static void method4() {
		int score = 70;
		try {
			if(score <= 70) throw new RuntimeException("70�̻󸸰���");
		}catch (RuntimeException aa) {
			System.out.println(aa.getMessage());
		}
			//���ܸ� ����Ű�� ó���� ��
		System.out.println("method4 end");
		
	}

	private static void method3() {
		int score = 70;
		if(score <= 70) throw new RuntimeException("70�̻󸸰���");
		//���ܸ� ����Ű�� ó���� ��������. ���α׷��ߴܵ�
		System.out.println("method3 end");
	}

	private static void method2() {
		try {
			FileReader fr = new FileReader("src");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void method1() {
		int a = 10/0;
		
	}

}
