package com.kosta.day11;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//동기화 메서드 ... 하나의 쓰레드가 점유 하는 동안에 다른 쓰레드가 못 들어온다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);

	}

}
