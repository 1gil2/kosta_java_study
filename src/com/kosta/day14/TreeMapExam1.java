package com.kosta.day14;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(95);
		System.out.println("95�� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());
	
		entry = scores.higherEntry(95);
		System.out.println("95�� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
	
		entry = scores.floorEntry(95);
		System.out.println("95�� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(85);
		System.out.println("85�� �̻� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü �� : " + scores.size() + ")");
		}
	}

}