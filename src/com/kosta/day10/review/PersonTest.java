package com.kosta.day10.review;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		sample1();

	}

	private static void sample2() {
		String[] phone1 = {"010-1111-2222-", "010-3333-4444"};
		String[] phone2 = {"010-1111-2222-", "010-3333-4444"};
		boolean b = Arrays.equals(phone1, phone2);
		System.out.println(b);
		
	}

	private static void sample1() throws CloneNotSupportedException {
		
		Car car = new Car("SM7", 3000);
		String[] phone = {"010-1111-2222-", "010-3333-4444"};
		Person p1 = new Person("홍길동", 20, car, phone);
		Person p3 = new Person("홍길동", 20, new Car("SM7", 3500), phone);
		Person p2 = new Person("김길동", 30,
				new Car("그랜져", 5000),
				new String[] {"010-5555-6666","010-7777-8888"});
		//복제아님, 같은주소를 참조한다.
		Person p4 = p3;
		Person p5 = (Person)p3.clone();
		p3.setName("박가산");
		
		System.out.println(p3);
		System.out.println(p5);
		System.out.println(p3.hashCode());
		System.out.println(p5.hashCode());
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p3));
		
	}

}
