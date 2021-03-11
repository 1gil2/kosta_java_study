package com.kosta.day11;

public class PrintThread extends Thread{
	
	ShareAccount shareAccount;
	
	public PrintThread(ShareAccount shareAccount) {
		this.shareAccount = shareAccount;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println("ÀÜ¾×ÇÕ°è : " + shareAccount.getTotal());
			
		}
	}
	
}
