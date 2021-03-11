package com.kosta.day07;

public class AccountTest {

	public static void main(String[] args) {
		method2();
	}

	private static void method2() {
		CheckingAccount acc = new CheckingAccount();
		acc.setAccNo("122-1555");
		acc.setOwnerName("ȫ�浿");
		acc.setBalance(1000);
		acc.setCardNo("5555");
		System.out.println(acc);

		acc.deposit(2000);
		acc.withdraw(500);
		System.out.println(acc);
		
		acc.pay("5555", 300);
	}

	private static void method1() {
		Account acc = new Account();
		acc.setAccNo("122-1555");
		acc.setOwnerName("ȫ�浿");
		acc.setBalance(1000);
		System.out.println(acc);

		acc.deposit(2000);
		acc.withdraw(500);
		System.out.println(acc);
	}

}
