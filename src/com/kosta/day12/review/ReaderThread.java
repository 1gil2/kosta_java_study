package com.kosta.day12.review;

public class ReaderThread extends Thread {

	MailBox box;
	int count;
	
	public ReaderThread(MailBox box, int count) {
		setName("ReaderThread¿”");
		this.box = box;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			String name = getName();
			System.out.println(
					name + " -> " + box.getMessage()); 
			System.out.println("---------------------");
		}
	}

}
