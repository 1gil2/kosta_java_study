package com.kosta.day11;

public class BathThread extends Thread{
	//���� ����
	Bathroom room;
	//����� �̸�
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
