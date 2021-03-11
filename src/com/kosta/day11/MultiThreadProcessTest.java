package com.kosta.day11;

public class MultiThreadProcessTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + "시작");
		
		// Multi Thread 사용하기
		// 1. Thread상속받은 class이용...대문자 출력
		// 2. Runnable Interface를 구현한class이용...소문자 출력
		Thread t1 = new AlphaThread();
		Runnable r = new AlphaThread2();
		Thread t2 = new Thread(r);
		Thread t3 = new AlphaThread();
		
			t1.setName("대문자 1");
		t2.setName("소문자 1");
		t3.setName("대문자 2");
		
		t1.start(); // run이 자동실행
		t2.start(); 
		t3.start();
		
		
		// main은 숫자를 출력
		for(int i = 1; i <= 26; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + "끝");
		
	}

}
