package com.kosta.day03;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		double n;
		double total = 0;
				
		
		System.out.println("[더 입력할 점수가 없으면 -1을 입력]");
		while (true) {
			System.out.print("점수를 입력하십시오 : ");
			n = sc.nextDouble();
			if (n == -1) break;
			cnt++;
			total += n;
		}
		
		System.out.println("입력된 점수들의 수 : " + cnt);
		System.out.println("점수들의 평균(double value) : " + total/cnt);
		System.out.println("점수들의 평균(int value) : " + (int)total/cnt);
			
		sc.close();

	}

}
