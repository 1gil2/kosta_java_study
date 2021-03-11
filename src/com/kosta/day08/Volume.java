package com.kosta.day08;

//interface -> 상수 + 추상메서드
//abstract class -> 일반 class + 추상메서드
public interface Volume {

	//1. 상수
	public static final String TITLE="볼륨";
	public static final String TITLE2="볼륨2";
	
	//2. 추상메서드
	void volumeUp(int level);
	abstract void volumeDown(int level);
	//3. default method 8 버전에서 추가됨
	default void close() {
		System.out.println("Volume interface 구현한 모든 class에 적용된다.");
	}
	
	//4. static method
	static void volumeInfo() {
		System.out.println("Volume Infomation");
	}
	
}
