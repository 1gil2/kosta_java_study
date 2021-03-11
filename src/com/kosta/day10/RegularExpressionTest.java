package com.kosta.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  ~ : Æ¿µå
 *  ^ : Ä³·µ
 *  ` : ¹éÆ½
 *  , : ÄŞ¸¶
 *  ; : ¼¼¹ÌÄİ·Ğ
 *  : : Äİ·Ğ
 *  " : ´õºíÄõÅ×ÀÌ¼Ç
 *  ' : ½Ì±ÛÄõÅ×ÀÌ¼Ç
 */

public class RegularExpressionTest {
	/*
	 * RegularExpression Á¤±Ô Ç¥Çö½Ä
	 *  []  : ¼±ÅÃ [abc]
	 *   -  : ¹üÀ§ [A-Za-z0-9] 
	 *  [^] : Á¦¿Ü [^a-z] ¼Ò¹®ÀÚ ¾ÈµÊ
	 *  ^[] : ½ÃÀÛ
	 *   $  : ³¡
	 *   {¼ıÀÚ} : ÀÚ¸®¼ö 
	 *   {¼ıÀÚ1, ¼ıÀÚ2} : ¼ıÀÚ1 ~ ¼ıÀÚ2
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
		String phone = "ÃÖ ÇÑ±æ";
		String expString = "([°¡-ÆR ]{1}) ([°¡-ÆR ]{2})";
		
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
		String phone = "ÃÖÇÑ±æ";
		String expString = "[°¡-ÆR]+";
		
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
