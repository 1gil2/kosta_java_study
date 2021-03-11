package com.kosta.day11;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		method7();
		
	}

	private static void method8() {
		Date d1 = new Date();
			
	}

	private static void method7() {
		LocalDate d = LocalDate.now();
		LocalDate d3 = d.minusDays(7);
		System.out.println(d);
		System.out.println("������ ��" + d3);
		
		System.out.println(d);
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println(d2);
		
	}

	private static void method6() {
		String s = "�ڵ����� ���� {0}�̰� �ڵ����� ������ {1}�̴�.";
		Car car = new Car("��A", 2000);
		String[] obj = {car.getModel(), car.getPrice()+""};
		String s2 = MessageFormat.format(s, obj);
		
		System.out.println(s2);
		
	}

	private static void method5() {
		String s = "���̵�� {0} ��ȭ�� {1}";
		String result = MessageFormat.format(s, "hong", "010-0000-1111");
		System.out.println(result);	
		
	}

	private static void method4() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
	}

	private static void method3() {
		int su = 1234548451;
		DecimalFormat df = new DecimalFormat("###,###,###");
		String s = df.format(su);
		System.out.println(s);
	
	}

	private static void method2() {
		Calendar cal = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar cal2 = Calendar.getInstance(tz);
		
		System.out.println(cal);
		System.out.println(cal2);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	
	}

	private static void method1() {
		Date d = new Date();
		
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime());
		
		java.sql.Date d2 = new java.sql.Date(d.getTime());
		System.out.println(d2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
