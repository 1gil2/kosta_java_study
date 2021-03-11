package com.kosta.day12.review;

public class MailBox {
	
	private String message;

	public synchronized String getMessage() {
		if(this.message == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String returnValue = this.message;
		this.message = null;
		notify();

		return returnValue;
	}

	public synchronized void setMessage(String message) {
		if(this.message != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("메시지변경 : " + message);
		this.message = message;
		notify();
	}
	
	

}
