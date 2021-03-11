package com.kosta.day11;

public class BeepPrintExample {

	public static void main(String[] args) {

		BeepThread t1 = new BeepThread("»à¾²·¹µå");
		t1.start();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " ...¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
