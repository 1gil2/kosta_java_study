package com.kosta.day11;

public class PriorityExample {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {

			Thread t = new AlphaThread();
			
			if(i == 10) {
				t.setPriority(Thread.MAX_PRIORITY);
			}else {
				t.setPriority(Thread.MIN_PRIORITY);
			}
			
			t.start();
		}

	}

}
