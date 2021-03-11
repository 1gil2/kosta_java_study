package com.kosta.day05;

class Account {
	private String accNo;
	private int balance = 0;
	
	public Account(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
		getBalance();
	}
	
	void save(int a) {
		balance += a;
		System.out.println(accNo + " 계좌에 " + a + "만원이 입금되었습니다.");
		getBalance();
	}
	
	void deposit(int a) {
		balance -= a;
		System.out.println(accNo + " 계좌에 " + a + "만원이 출금되었습니다.");
		getBalance();
	}
	
	void getBalance() {
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
	}
	
	void getAccNo() {
		System.out.println("계좌번호 : " + accNo);
	}
}


public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("078-3762-293");
		a.save(100);
		a.deposit(30);
	}

}
