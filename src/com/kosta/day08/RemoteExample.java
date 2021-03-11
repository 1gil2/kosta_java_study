package com.kosta.day08;

public class RemoteExample {
	
	public static void method3(RemoteControl a) {
		if(a instanceof Searchable)
			((SmartTelevision)a).search("http://www.naver.com");
		a.setMute(false);
		a.setVolume(25);
		a.turnOn();
		a.turnOff();
		System.out.println("--------------------");
	}
	
	public static void method2() {
		SmartTelevision a = new SmartTelevision();
		RemoteControl a2 = new SmartTelevision();
		RemoteControl a3 = new Televison();
		method3(a);
		method3(a2);
		method3(a3);
	}
	
	public static void method1(RemoteControl remote) {
		remote.turnOn();
		remote.setVolume(20);;
		remote.setMute(true);
		remote.setMute(false);
		remote.turnOff();
		
		RemoteControl.changeBattery();
	}
	
	public static void main(String[] args) {
		//익명의 interface를 구현한 class
		//불가...interface는 객체생성불가 new RemoteControl()
		RemoteControl aa = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("익명class...turn on");
			}
			
			@Override
			public void turnOff() {
				System.out.println("익명class...turn off");				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("익명class...set volume");
			}
		};
		
		method2();
		
		
	}
}
