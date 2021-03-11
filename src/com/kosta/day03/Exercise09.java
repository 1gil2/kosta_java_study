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
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("--------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("�л���>");
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
				System.out.println("�ְ� ���� : "+highest);
				System.out.println("��� ���� : "+avg/studentNum);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}