package com.kosta.day11;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//����ȭ �޼��� ... �ϳ��� �����尡 ���� �ϴ� ���ȿ� �ٸ� �����尡 �� ���´�.
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
