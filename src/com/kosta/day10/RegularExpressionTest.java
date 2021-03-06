package com.kosta.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  ~ : 틸드
 *  ^ : 캐럿
 *  ` : 백틱
 *  , : 콤마
 *  ; : 세미콜론
 *  : : 콜론
 *  " : 더블쿼테이션
 *  ' : 싱글쿼테이션
 */

public class RegularExpressionTest {
	/*
	 * RegularExpression 정규 표현식
	 *  []  : 선택 [abc]
	 *   -  : 범위 [A-Za-z0-9] 
	 *  [^] : 제외 [^a-z] 소문자 안됨
	 *  ^[] : 시작
	 *   $  : 끝
	 *   {숫자} : 자리수 
	 *   {숫자1, 숫자2} : 숫자1 ~ 숫자2
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
		String phone = "최 한길";
		String expString = "([가-힣 ]{1}) ([가-힣 ]{2})";
		
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
		String phone = "최한길";
		String expString = "[가-힣]+";
		
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
