package com.kosta.day11;

public class ShareAccount {
	Account lee;
	Account sung;
	
	public ShareAccount(Account lee, Account sung) {
		super();
		this.lee = lee;
		this.sung = sung;
	}
	
	//��ü�ϱ�
	public void transfer() {
		int amount = lee.withdraw(100);
		sung.deposite(amount);
		System.out.println(amount + " --> ����(lee -> sung)");
	}
	
	//�ܾ�Ȯ��
	public int getTotal() {
		return lee.getBalance() + sung.getBalance();
	}

}
