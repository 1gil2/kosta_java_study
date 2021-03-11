package com.kosta.day04;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee order1 = new Coffee("아메리카노", 2000);
		Coffee order2 = new Coffee("카페라떼", 3000);
		
		order1.print();
		order2.print();
	}

}