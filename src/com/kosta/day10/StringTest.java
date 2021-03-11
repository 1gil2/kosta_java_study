package com.kosta.day10;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) throws IOException {
		method8();

	}

	private static void method8() {
		// String : �������ڿ�, ����� ������ �� ����.
		
		// StringBuffer, StringBuilder : �������ڿ��̴�. ���� ����, +���� �Ұ�
		StringBuffer sb = new StringBuffer("�������ڿ��̴�.");
		//�Ұ� sb = sb + "AAA";
		sb.append("����...���������ȴ�.");
		sb.replace(8,10, "***");
		System.out.println(sb);
	}

	private static void method7() {
		String s = "������,���ؿ�-������&���Ľ� ���ѱ�";
		StringTokenizer st = new StringTokenizer(s, ",|-|&| ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
	}

	private static void method6() {
		// ���ڿ� �и�
		String s = "������,���ؿ�-������&���Ľ� ���ѱ�";
		String[] name = s.split(",|-|&| ");
		for(String n : name) {
			System.out.println(n);
		}
	}

	private static void method5() throws IOException {
//		System.out.print("�Է�>>");
//		int a;
//		while((a = System.in.read()) != -1){
//			System.out.println(a);
//		}
		
		byte[] arr = new byte[100];
		System.out.print("�Է�>>");
		int cnt = System.in.read(arr);
		System.out.println(cnt + " �Է� �ڸ���");
		System.out.println(Arrays.toString(arr) + " �Է¹���");
		System.out.println("*" + new String(arr, 0, cnt-2) + "*");
		System.out.println("----------------");
		
	}

	private static void method4() {
		String s = "�ڹٰ� �� ����ִ�.";
		System.out.println(s.indexOf("��"));
		System.out.println(s.length());
		System.out.println(s.replace("��", "�ſ�"));
		//���������� �ȵ�, string�� �����ȵ�
		System.out.println(s);
		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 5));
		
		s = "       A Hello World      ";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("*" + s + "*");
		System.out.println("*" + s.trim() + "*");
		
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(123));
	}

	private static void method3() throws UnsupportedEncodingException {
		String s = "Hello World";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
		byte[] arr = s.getBytes("utf-8");
		System.out.println(Arrays.toString(arr));
	}

	private static void method1() {
		//�������̿��ϱ�
		String s1 = "�ڹ�";
		String s2 = new String("�������̿�");
		
		byte[] arr1 = {65, 66, 67};
		char[] arr2 = {'A', 'B', 'C', 'D'};
		
		String s3 = new String(arr1);
		String s4 = new String(arr2);
		
		byte[] arr3 = new byte[100];
		int count = method2(arr3);
		String s5 = new String(arr3, 0, count-2);
		System.out.println(s5);
	}

	private static int method2(byte[] arr3) {
		System.out.print("�Է�>>");
		int count = 0;
		try {
			count = System.in.read(arr3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return count;
		
	}

}
