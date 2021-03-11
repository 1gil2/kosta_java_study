package com.kosta.day11;

public class ShareAccount {
	Account lee;
	Account sung;
	
	public ShareAccount(Account lee, Account sung) {
		super();
		this.lee = lee;
		this.sung = sung;
	}
	
	//이체하기
	public void transfer() {
		int amount = lee.withdraw(100);
		sung.deposite(amount);
		System.out.println(amount + " --> 이제(lee -> sung)");
	}
	
	//잔액확인
	public int getTotal() {
		return lee.getBalance() + sung.getBalance();
	}

}
