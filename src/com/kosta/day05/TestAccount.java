package com.kosta.day05;

class Account {
	private String accNo;
	private int balance = 0;
	
	public Account(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " ���°� �����Ǿ����ϴ�.");
		getBalance();
	}
	
	void save(int a) {
		balance += a;
		System.out.println(accNo + " ���¿� " + a + "������ �ԱݵǾ����ϴ�.");
		getBalance();
	}
	
	void deposit(int a) {
		balance -= a;
		System.out.println(accNo + " ���¿� " + a + "������ ��ݵǾ����ϴ�.");
		getBalance();
	}
	
	void getBalance() {
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");
	}
	
	void getAccNo() {
		System.out.println("���¹�ȣ : " + accNo);
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
