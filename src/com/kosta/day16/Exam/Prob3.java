package com.kosta.day16.Exam;

class Prob3 {
	public static void main(String args[]){
		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);
		skt.printCharge2();
		ktf.printCharge2();
		lgt.printCharge2();
	}
}

class PhoneCharge{	
	//구현하시오.
	private String user;
	private int call;
	private int sms;
	private int data;
	private int total;
	
	public PhoneCharge() {
		
	}

	public int printCharge2() {
		int callFee = call >= 200?call*20:call*10;
		int smsFee = sms >= 300?sms*80:sms*20;
		int dataFee = data >= 7?data*2000:data*1000;
		return callFee + smsFee + dataFee;
	}

	public PhoneCharge(String user, int call, int sms, int data) {
		super();
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data;
	}
	
	public int calcCharge() {
		int callFee = 0;
		int smsFee = 0;
		int dataFee = 0;
		
		if(call >= 200) {
			callFee = 20*call;
		}else {
			callFee = 10*call;
		}
		
		if(sms >= 300) {
			smsFee = 80*sms;
		}else {
			smsFee = 20*sms;
		}
		
		if(data >= 7) {
			dataFee = 2000*data;
		}else {
			dataFee = 1000*data;
		}
		
		return callFee + smsFee + dataFee;
	}
	
	public void printCharge() {
		System.out.println(user + " 사용자는 이번달에 사용하신 전화요금이 " + calcCharge() + " 원입니다.");
	}
		
}
 