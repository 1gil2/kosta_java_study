package com.kosta.day11;

//다른 class를 상속받고있지 않아서 Thread상속 가능
//run메서드를 구현해야 멀티thread로 사용가능
public class AlphaThread extends Thread{

	@Override
	public void run() {
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.println(getName() + " -> " + c);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5초 대기
		}
	}
	
}
