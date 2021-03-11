package com.kosta.day09;

public class ExceptionTest {

	public static void main(String[] args) {
		method8();
		System.out.println("main end");
	}

	private static void method8() {
		try {
			int a = 10/1;
			int[] arr = new int[5];
			arr[4] = 100;
			String s = "JAVA";
			System.out.println(s.length());
			Object obj = new String("자바");
			String st = (String)obj;
			Integer i = (Integer)obj;
		//Exception으로 한방에 처리해도 되지만 각각의 오류마다 다른 처리를 하기위해 나눈다.
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없음");
		}catch (IndexOutOfBoundsException e){
			System.out.println("index범위 벗어남");
		}catch (NullPointerException e) {
			System.out.println("Null참조불가");
		}catch (ClassCastException e) {
			System.out.println("형변환 오류");
		}catch (Exception e) {
			System.out.println("기타 오류" + e.getMessage());
		}finally {
			System.out.println("반드시수행한다.");
		}
		
	}

	private static void method7() {
		//예외처리
		//1. 내가 한다. : try - catch - finally
		//2. 떠넘긴다. : throws
		try {
			System.out.println("예외발생 가능성있는 문장들");
			int a = 10/0;
			System.out.println("이문장은 수행안한다.");
		}catch (RuntimeException e) {
			//ArithmeticException -> RuntimeException -> Exception
			System.out.println("예외발생시 수행한다.");
		}finally {
			System.out.println("항상 수행한다. 생략가능");
			//자원반납코드를 한다. : DB닫기, 파일닫기
		}
		
	}

	private static void method6() {
		String s = new String("자바");
		//자동형변환
		Object s2 = new String("자바");
		//강제형변환
		try {
		String s3 = (String)s2;
		Integer i = (Integer)s2;
		}catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void method5() {
		int[] arr = new int[5];
		try {
		System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void method4() {
		try {
			String s = "자바";
			System.out.println("s의 글자수 : " + s.length());
			s = null;
			System.out.println("s의 글자수 : " + s.length());
		}catch (NullPointerException e) {
			System.out.println("null은 사용불가");
		}
	}

	private static void method3() {
		//Exception 종류 : 컴파일 체크 예외, 실행 예외(Runtime Exception)
		try {
			Class.forName("com.kosta.day09.review.Button");
			System.out.println("load 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("class load 실패");
			e.printStackTrace();
		}
	}

	private static void method2(int a, int b) {
		try {
			//예외발생 가능성있는 문장들
			System.out.println(a/b);
		}catch (ArithmeticException aa) {
			System.out.println("0으로 못 나눔");
		}

	}

	//오류가 발생하지 않도록 업무로직 중간에 값을 체크
	//업무로직 + 오류처리로직 섞인다....좋은 코드 아니다.
	//Exception 사용
	private static void method1() {
		System.out.println(10/0);

	}

}
