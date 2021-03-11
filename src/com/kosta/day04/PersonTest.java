package com.kosta.day04;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(26, "최한슬");
		
		p1.selfIntroduce();
		p2.selfIntroduce();
		
		System.out.println("전체 인구수 는 : " + Person.getPopulation());

	}

}
