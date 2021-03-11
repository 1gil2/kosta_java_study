package com.kosta.day07;

public class Account {
	private String accNo;
	private String ownerName;
	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "가 입금되었습니다.");
	}
	public int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}else {
			balance -= amount;
			return amount;
		}
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
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

	
}
