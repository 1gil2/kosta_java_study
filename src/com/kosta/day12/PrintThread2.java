package com.kosta.day12;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("다른 쓰레드가 인터럽트를 걸어서 나의 쓰레드 종료");
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
