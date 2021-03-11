package com.kosta.day05;

class Sparrow {
	String name;
	static int legs = 2;
	int length;
	
	void fly() {
		System.out.println("참새(" + name + ")가 날아다닙니다.");
	}

	void sing() {
		System.out.println("참새(" + name + ")가 소리내어 웁니다.");
	}
	
	void toMyString() {
		System.out.println("참새의 이름은 " + name + " 입니다.");
	}
	
	void setName(String name) {
		this.name = name;
	}
}


class Duck {
	String name;
	static int legs = 2;
	int length;
	

	void fly() {
		System.out.println("오리(" + name + ")는 날지 않습니다.");
	}
	
	void sing() {
		System.out.println("오리(" + name + ")가 소리내어 웁니다.");
	}
	
	void toMyString() {
		System.out.println("오리의 이름은 " + name + " 입니다.");
	}
	
	void setName(String name) {
		this.name = name;
	}
}

public class PlayBird {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d = new Duck();
		Sparrow s = new Sparrow();
		
		d.setName("꽥꽥이");
		s.setName("짹짹");
		d.fly();
		d.sing();
		d.toMyString();
		s.fly();
		s.sing();
		s.toMyString();

	}

}
