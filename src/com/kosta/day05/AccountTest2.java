package com.kosta.day05;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] arr = new Account[10];
		
		for ( int i = 0; i< 10 ; i++) {
			arr[i]= new Account(i+1+"°èÁÂ"); 
		}
		
		for(Account acc:arr) {
			acc.save(10);
		}

	}

}
