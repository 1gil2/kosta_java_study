package com.kosta.day07;

public class CheckingAccount extends Account {
	
	private String cardNo;

	public int pay(String cardNo, int amount) {
		if(!cardNo.equals(this.cardNo)) {
			System.out.println("카드번호오류");
			return 0;
		}
		
		return withdraw(amount);
	}
	
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		String st = super.toString();
		return st + " CheckingAccount [cardNo=" + cardNo + "]";
	}
	
}
