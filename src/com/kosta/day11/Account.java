package com.kosta.day11;

public class Account {
	private String accNo;
	private String ownerName;
	private int balance;

	public Account() {

	}
	public Account(String accNo, String ownerName, int balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposite(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("ÀÜ°íºÎÁ·");
			return 0;
		}
		balance -= amount;
		return amount;
	}

}
