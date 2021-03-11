package com.kosta.day13;

import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class LambdaExam4 {

	public static void main(String[] args) {
		method3();

	}

	private static int[] scores = {10, 50, 3};

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score: scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}


	private static void method3() {
		int max = maxOrMin(
				(a,b) -> {
					if(a > b) return a;
					return b;
				});
		System.out.println("최대값: " + max);
	}

	private static int method2(int x, int y) {
		IntSupplier supplier = () -> {
			//			x *= 10; local 변수는 변경 불가
			int result = x+y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}

	private static void method1() {
		Predicate<String> p = a -> {
			if(a.length() > 2) return true;
			return false;
		};

		System.out.println(p.test("Hello"));
		System.out.println(p.test("Hi"));

	}
}
