package com.kosta.day12.review;

public class WriterThread implements Runnable{

	MailBox box;
	String[] messages;
	String myName = "WriterThreadÀÓ";
	
	public WriterThread(MailBox box, String[] messages) {
		this.box = box;
		this.messages = messages;
		Thread.currentThread().setName(myName);

	}

	@Override
	public void run() {
		for(String msg : messages) {
			box.setMessage(msg);
			System.out.println(
					myName + " -> " + msg);
			System.out.println("**************");
		}
			
	}

}
