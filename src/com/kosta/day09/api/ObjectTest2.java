package com.kosta.day09.api;

import java.io.CharArrayWriter;
import java.util.Arrays;
import java.util.Date;

public class ObjectTest2 {

	public static void main(String[] args) {
		method10();

	}

	private static void method10() {
		String[] arr = {"네비", "전방카메라"};
		Car car = new Car("그랜져", 5000, arr);
		Car car2 = null;
		try {
			car2 = (Car) car.clone();
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		car.model = "SM7";
		car.price = 3000;
		car.accessory[0] = "자바책";
		System.out.println(car);
		System.out.println(car2);
	}

//	private static void method9() {
//		Car car = new Car("그랜저", 5000) ;
//		Car car2 = null;
//		try {
//			car2 = (Car) car.clone();
//		}catch (CloneNotSupportedException e) {
//			
//		}
//		car.model = "SM5";
//		System.out.println(car);
//		System.out.println(car2);
//		
//	}

//	private static void method8() {
//		Car car = new Car("그랜저", 5000);
//		Car car2 = car;
//		car.model = "SM5";
//		System.out.println(car);
//		System.out.println(car2);
//		
//	}

	private static void method7() {
		// 복제
		int[] a = {1,2,3,4,5};
		int[] b = a;
		a[0] = 99;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

	private static void method6() {
		//복제
		int a = 10;
		int b = a;
		a++;
		System.out.println(a);
		System.out.println(b);
		
	}

	private static void method5() {
		//복제
		String s1 = new String("자바");
		String s2 = s1;
		s1 = "DB";
		//s1 = new String("DB");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

	private static void method4() {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.toGMTString());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date d2 = new Date();
		System.out.println(d2.toLocaleString());
		
	}

//	private static void method3() {
//		Car c1 = new Car("그랜저", 4000);
//		Car c2 = new Car("소나타", 3000);
//		
//		System.out.println(c1);
//		System.out.println(c1.toString());
//		System.out.println(c2);
//		System.out.println(c2.toString());
//		
//	}

	private static void method2() {
		String st1 = new String("자바");
		String st2 = new String("자바");
		
		System.out.println(st1);
		System.out.println(st1.toString());
		System.out.println(st2);
		System.out.println(st2.toString());
		
	}

	private static void method1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//class이름@hax(hashcode)
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
	}

}
