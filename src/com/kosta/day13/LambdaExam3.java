package com.kosta.day13;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.LongToDoubleFunction;

interface LongToDoubleFunction2{
	double applyAsDouble(long num);
}

public class LambdaExam3 {

	public static void main(String[] args) {
		method6();

	}

	private static void method6() {
		int[] scores = {100, 30, 70, 20, 99};
		int max = 0;
		for(int score : scores) {
			
		}
		
		IntBinaryOperator f = (a, b) -> {
			if(a > b) return a;
			return b;
		};
		f.applyAsInt(123, 543);
		
	}

	private static void method5() {
		IntBinaryOperator ibo = (a, b) -> {
			if(a >= b) return a;
			return b;
		};
		
		int res = ibo.applyAsInt(3, 5);
		System.out.println(res);
	}

	private static void method4() {
		BinaryOperator<String> bo = (a, b) -> a+b;
		String st = bo.apply("123", "567");
		System.out.println(st);
	}

	private static void method3() {
		LongToDoubleFunction f = (a) -> {
			return a*Math.PI;
		};
		
		LongToDoubleFunction2 f2 = (a) -> {
			return a*Math.PI;
		};
		
		long lo = 1000;
		double du = f.applyAsDouble(lo);
		System.out.println(lo);
		System.out.println(du);

	}

	private static void method2() {
		Function<Integer, String> f = (a) -> {
			if(a>=90)
				return "A";
			else 
				return "B";
		};
		
		String result = f.apply(99);
		
	}

	private static void method1() {
		//소비자 interface
		Consumer<String> consumer = a -> {
			System.out.println("파라메터 1개 받아서 실행한다.");
			System.out.println("받은값 : " + a);
		};
		consumer.accept("asd");
		
	}

}
