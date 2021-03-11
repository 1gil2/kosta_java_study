package com.kosta.day10;

//WraperClass = �⺻�� + ����߰�
/* �⺻�� -> ������, ����, �񱳸� ���� ����Ѵ�.
 * 1. byte    -> Byte
 * 2. short   -> Short
 * 3. char    -> Character
 * 4. int     -> Integer
 * 5. long    -> Long
 * 6. float   -> Float
 * 7. double  -> Double
 * 8. boolean -> Boolean
 */



public class WrapperTest {

	public static void main(String[] args) {
		method2();

	}

	private static void method2() {
		char c1 = 'a'; //97 - > 'A' 65
		
 		System.out.println("�빮����� : ");
 		System.out.println((char)(65));

 		Character c2 = 'a';
 		System.out.println(Character.toUpperCase(c2));

	}

	private static void method1() {
		int a = 10;
		Integer b = new Integer(20);
		Integer c = 30; //AutoBoxing
		
		System.out.println(c.floatValue());
		System.out.println(c.intValue());
		System.out.println(c); //AutoUnBoxing
		System.out.println(c+100);
		
	}

}
