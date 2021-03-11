package com.kosta.day09;


//>java ExceptionTest2 10 3
//자동으로 예외발생 -> 예외처리를 하지않았다면 JVM에 간다.
//JVM이 예외객체를 만들어준다.
//프로그램중단
public class ExceptionTest2 {

	public static void main(String[] args) {
		//명령행 매개변수 2개를 받아서 사칙연산 수행한다.
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
		}catch (ArrayIndexOutOfBoundsException e) {
			//JVM이 만들어준 예외객체를 받는다. 처리한다.
			System.out.println(e.getMessage());
		}catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}

}
