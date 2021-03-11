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
		// String : 고정문자열, 절대로 변경할 수 없다.
		
		// StringBuffer, StringBuilder : 가변문자열이다. 변경 가능, +연산 불가
		StringBuffer sb = new StringBuffer("가변문자열이다.");
		//불가 sb = sb + "AAA";
		sb.append("수정...실제수정된다.");
		sb.replace(8,10, "***");
		System.out.println(sb);
	}

	private static void method7() {
		String s = "최은비,장준영-이주희&남후승 최한길";
		StringTokenizer st = new StringTokenizer(s, ",|-|&| ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());
	}

	private static void method6() {
		// 문자열 분리
		String s = "최은비,장준영-이주희&남후승 최한길";
		String[] name = s.split(",|-|&| ");
		for(String n : name) {
			System.out.println(n);
		}
	}

	private static void method5() throws IOException {
//		System.out.print("입력>>");
//		int a;
//		while((a = System.in.read()) != -1){
//			System.out.println(a);
//		}
		
		byte[] arr = new byte[100];
		System.out.print("입력>>");
		int cnt = System.in.read(arr);
		System.out.println(cnt + " 입력 자리수");
		System.out.println(Arrays.toString(arr) + " 입력문자");
		System.out.println("*" + new String(arr, 0, cnt-2) + "*");
		System.out.println("----------------");
		
	}

	private static void method4() {
		String s = "자바가 참 재미있다.";
		System.out.println(s.indexOf("참"));
		System.out.println(s.length());
		System.out.println(s.replace("참", "매우"));
		//원본수정은 안됨, string은 수정안됨
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
		//생성자이용하기
		String s1 = "자바";
		String s2 = new String("생성자이용");
		
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
		System.out.print("입력>>");
		int count = 0;
		try {
			count = System.in.read(arr3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return count;
		
	}

}
