package com.kosta.day09;

class Dice {
	int size;
	Dice(int size){
		this.size = size;
	}
	
	int play() {
		int number = (int)(Math.random() * size) + 1;
		return number;
	}
}

public class DiceGame {

	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		
		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result1);

		try {
			int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result2);
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	int countSameEye(int n) { // throws IllegalArgumentException {
		
		//예외강제발생
		if(n < 0) throw new IllegalArgumentException("n에 음수는 안됨");

		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		
		int cnt = 0;
		
		for(int i = 0; i < n ; i++) {
			if(dice1.play() == dice2.play())
				cnt += 1;
		}
		
		return cnt;
	}

}
