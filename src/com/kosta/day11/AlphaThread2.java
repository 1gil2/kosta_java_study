package com.kosta.day11;

//다른 class를 상속받고있지 않아서 Thread상속 불가능
//run메서드를 구현해야 멀티thread로 사용가능
public class AlphaThread2 extends Object implements Runnable{

	@Override
	public void run() {
		System.out.println("소문자 스레드 이름 : " + Thread.currentThread().getName());
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(Thread.currentThread().getName() + " -> " + c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
