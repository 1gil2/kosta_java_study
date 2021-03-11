package com.kosta.day12;

public class ThreadTest {

	public static void main(String[] args) {
		method3();
		
	}

	private static void method3() {
		AutoSaveThread autoSaveThread = new AutoSaveThread("자동저장쓰레드");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");
		
	}

	private static void method2() {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();
		
	}

	private static void method1() {
		PrintThread1 t1 = new PrintThread1();
		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.setStop(true);
		System.out.println("메인 끝");
	}

}
