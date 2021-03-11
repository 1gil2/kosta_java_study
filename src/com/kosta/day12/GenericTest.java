package com.kosta.day12;

public class GenericTest {

	public static void main(String[] args) {
		method6();
	}

	private static void method6() {
		int result = Util.compare1(10, 20);
		System.out.println(result);
	}

	private static void method5() {
		
		Pair<String, String> p1 = new Pair<String, String>();
		p1.setKey("이름");
		p1.setVal("사과");
		
		Pair<String, String > p2 = new Pair<String, String>();
		p2.setKey("이름");
		p2.setVal("사과");
		
		Pair<String, Integer > p3 = new Pair<String, Integer>();
		p3.setKey("이름");
		p3.setVal(123);
		
		boolean b1 = Util.compare(p1, p2);
		System.out.println(b1);
		
	}

	private static void method4() {
		Box<Integer> a = Util.boxing(100);
		Box<Integer> b = Util.<Integer>boxing(100);
		
		Box<String> s = Util.boxing("Hello");
		
	}

	private static void method3() {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(100);
		int i = b1.getObj();
		
		Box<String> b2 = new Box<String>();
		b2.setObj("Hello");
		String s = b2.getObj();
		
		
	}

	private static void method2() {
		Box box = new Box();
		
		box.setObj(100);
		int i = (int)box.getObj();
		System.out.println(i);
		
		box.setObj("Hello");
		String s = (String)box.getObj();
		System.out.println(s);
		
	}

	private static void method1() {
		//배열...같은 타입, 여러개의 방을 만든다. 갯수는 반드시 고정
		String[] arr = new String[10];

		//Collection : List, Set, Map
		//아무거나, 여러개(갯수 가변)
		
	}

}
