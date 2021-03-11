package com.kosta.day11;

public class BathThread extends Thread{
	//공유 영역
	Bathroom room;
	//사용자 이름
	String userName;
	
	public BathThread(Bathroom room, String userName) {
		this.room = room;
		this.userName = userName;
	} 	
	
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			room.use(userName);
		}
		
	}
	
}
