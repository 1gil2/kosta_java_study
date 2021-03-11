package com.kosta.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  ~ : ƿ��
 *  ^ : ĳ��
 *  ` : ��ƽ
 *  , : �޸�
 *  ; : �����ݷ�
 *  : : �ݷ�
 *  " : ���������̼�
 *  ' : �̱������̼�
 */

public class RegularExpressionTest {
	/*
	 * RegularExpression ���� ǥ����
	 *  []  : ���� [abc]
	 *   -  : ���� [A-Za-z0-9] 
	 *  [^] : ���� [^a-z] �ҹ��� �ȵ�
	 *  ^[] : ����
	 *   $  : ��
	 *   {����} : �ڸ��� 
	 *   {����1, ����2} : ����1 ~ ����2
	 */

	public static void main(String[] args) {
		method4();
	}

	private static void method4() {
		String phone = "010-7878-9999";
		String exp = "([01]{3})-([0-9]{4})-([0-9]{4})";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(phone);
		boolean b = m.find();
		if(b) {
			System.out.println(m.group());
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
		}
		
	}

	private static void method3() {
		String phone = "�� �ѱ�";
		String expString = "([��-�R ]{1}) ([��-�R ]{2})";
		
		Pattern p = Pattern.compile(expString);
		Matcher m = p.matcher(phone);
		boolean b = m.find();
		if(b) {
			System.out.println(m.group());
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
		System.out.println(b);
	}

	private static void method2() {
		String phone = "���ѱ�";
		String expString = "[��-�R]+";
		
//		String phone = "010-778-6961239";
//		String expString = "[01]{3}-[0-9]{3,4}-\\d{4,}";
		
		Pattern p = Pattern.compile(expString);
		Matcher m = p.matcher(phone);
		boolean b = m.find();
		System.out.println(b);
		
	}

	private static void method1() {
		String phone = "010-778-6961239";
		String expString = "[01]{3}-[0-9]{3,4}-\\d{4,}";

		boolean result = Pattern.matches(expString, phone);
		System.out.println(result);
	}

}
