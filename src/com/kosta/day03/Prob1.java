package com.kosta.day03;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		double n;
		double total = 0;
				
		
		System.out.println("[�� �Է��� ������ ������ -1�� �Է�]");
		while (true) {
			System.out.print("������ �Է��Ͻʽÿ� : ");
			n = sc.nextDouble();
			if (n == -1) break;
			cnt++;
			total += n;
		}
		
		System.out.println("�Էµ� �������� �� : " + cnt);
		System.out.println("�������� ���(double value) : " + total/cnt);
		System.out.println("�������� ���(int value) : " + (int)total/cnt);
			
		sc.close();

	}

}
