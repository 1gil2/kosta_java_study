package com.kosta.day08.lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//�迭 : �ϳ��� �̸����� ���� ������ ���� ���� �����ϱ� ���� ���Ӱ����� ����� �ڷᱸ��
		//�ӵ� ����, ������ �˾ƾ� ��������
		Shape[] arr = new Shape[5];
		arr[0] = new Rectangle(10, 20);
		arr[1] = new Rectangle(10, 20);
		
		
		//Collection - List, Set, Map interface
		//List : ������ �ִ�. �ߺ����, �ʱⰪ�� ������ default ������ŭ ����, �ڵ����� �߰�
		List<Rectangle> aList = new LinkedList<>();
		aList.add(new Rectangle(10, 20));
	}

}
