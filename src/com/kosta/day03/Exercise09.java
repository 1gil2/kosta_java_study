package com.kosta.day03;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int highest = 0;
		double avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("--------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for(int i=0; i < scores.length ; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = scanner.nextInt();
					if (scores[i] > highest) {
						highest = scores[i];
					}
					avg += scores[i];
				}
			} else if (selectNo == 3) {
				for(int i=0; i < scores.length ; i++) {
					System.out.println("scores["+i+"] : "+scores[i]);
				}
			} else if (selectNo == 4) {
				System.out.println("최고 점수 : "+highest);
				System.out.println("평균 점수 : "+avg/studentNum);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
