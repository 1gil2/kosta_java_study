package com.kosta.day11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WrapperClass {

	public static void main(String[] args) {
		method6();

	}

	private static void method6() {
		Random r = new Random(1);
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() != 6) {
			lotto.add(r.nextInt(45) + 1);
		}
		
		System.out.println(lotto.toString());
		
	}

	private static void method5() {
		//로또번호 6개가 무작위 추출, 중복 없기
		
		int[] lotto = new int[6];
		Random r = new Random(1);
		int su;
		int last = 0;
		AA:while(true) {
			if(last == 6) break;
			su = r.nextInt(45) + 1;
			for(int i = 0; i< last; i++) {
				if(su == lotto[i]) continue AA;
			}
			lotto[last]= su;
			last++;
		}
	
		System.out.println(Arrays.toString(lotto));
	
	}

	private static void method4() {
		Random r = new Random();
		System.out.println(r.nextInt(45) + 1);

	}

	private static void method3() {
		System.out.println(Math.random()); // 0 <= x < 1

	}

	private static void method2() {
		int a = 10;
		int b = 20;

		System.out.println(Math.max(a, b));
		System.out.println(Math.round(98.5));
		System.out.println(Math.ceil(98.1));
		System.out.println(Math.floor(98.8));

	}

	private static void method1() {
		byte b = 10;
		short s = 10;
		char c = 'a';
		int i = 10;
		long l = 10L;
		boolean flag = true;
		float f = 3.14f;
		double d = 3.14;

		//AutoBoxing
		//객체?
		Byte b2 = 10; //new Byte(10)
		Short s2 = 10;
		Character c2 = 'a';
		Integer i2 = 10;
		Long l2 = 10L;
		Boolean flag2 = true;
		Float f2 = 3.14f;
		Double d2 = 3.14;

		//Unboxing
		System.out.println(b2 + 20);

		String str = "100";
		System.out.println(Integer.parseInt(str));

	}

}
