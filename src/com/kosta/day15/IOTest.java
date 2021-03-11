package com.kosta.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) throws FileNotFoundException {
		method6();

	}

	private static void method6() {
		//���丮 �����
		
		
	}

	private static void method5() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
//		System.out.print("�����Է�>>" + sc.next());
//		System.out.print("�����Է�>>" + sc.nextInt());		

		System.out.println("���� ��� �ϱ�");
		String s = sc.nextLine();
		System.out.println("�Է°��� " + s);
		
		sc.close();
		
	}

	private static void method4() throws FileNotFoundException {
		System.setOut(new PrintStream("output.txt"));
		PrintStream out = System.out;
		out.print("�ڹ�");
		
	}

	private static void method3() {
		System.out.println();
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		try {
			int i = ir.read();
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method2() {
		InputStream is = null;
		InputStreamReader ir = null;
		
		int data;
		try {
			is = new FileInputStream("src/com/kosta/day15/test.jpg");
			//1 byte -> 2 byte�� ����
			ir = new InputStreamReader(is);
			try {
				while((data = ir.read()) != -1) { //ascii code�� �д´�.
					System.out.println(data);
				}
			} catch (IOException e) {
				System.out.println("IOE");
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� ����");
		}finally {
			try {
				if(ir != null) ir.close();
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	private static void method1() {
		InputStream is = null;
		int data;
		try {
			is = new FileInputStream("src/com/kosta/day15/test.jpg");
			try {
				while((data = is.read()) != -1) { //ascii code�� �д´�.
					System.out.println(data);
				}
			} catch (IOException e) {
				System.out.println("IOE");
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� ����");
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
