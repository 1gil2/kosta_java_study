package com.kosta.day08;

public interface RemoteControl {
	
	//1. 상수...public static final 생략가능
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//2. abstract 메서드...정의있고 구현없다.
	//public abstract 생략가능
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//3. default 메서드...구현class 들의 공통적으로 사용하는 기능 구현
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//4. static 메서드...
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
