package com.kosta.day16.Exam;

public class Prob5 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		// �����Ͻÿ� - ���ڵ��� ������ ���� �����ϴ� �ڵ带 �ۼ��Ѵ�.

//		for(int i = 0; i < answer.length; i++) {
//			counter[answer[i]-1]++;
//		}
		
		for(int num : answer) {
			counter[num-1]++;
		}
		
				
		// �����Ͻÿ� - ��°���� ���� �������� �ۼ��Ѵ�.
		for(int i = 0; i < 4; i++) {
			System.out.println((i+1) + "�� ������" + counter[i] + "�� �Դϴ�." );
		}

	}

}
