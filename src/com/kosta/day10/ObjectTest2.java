package com.kosta.day10;

import java.util.Objects;

public class ObjectTest2 {

	public static void main(String[] args) {	
		
		long before1 = System.currentTimeMillis();
		long before2 = System.nanoTime();
		
		for(int i = 0; i <1000000; i++) {
			
		}
		
		long after1 = System.currentTimeMillis();
		long after2 = System.nanoTime();
		
		System.out.println(after1 - before1);
		System.out.println(after2 - before2);
		System.out.println();
		
		if(method2()) {
			System.out.println("null이군요");
			//함수 빠지기
			//return;
			//프로그램 종료
			//System.exit(0);
		}else {
			System.out.println("null이 아니다.");
		}
		System.out.println("main END");

	}

	private static boolean method2() {
		Book b1 = null;
		System.out.println(b1 == null);
		System.out.println(Objects.isNull(b1));
		
		return Objects.isNull(b1);
		
	}

	private static void method1() {
		Book b1 = new Book("자바다", 2000, true);
		Book b2 = new Book("자바다", 2000, true);
		
		//Objects.equals : 객체에 equals 수행
		boolean flag = Objects.equals(b1, b2);
		System.out.println(flag);
	}

}
