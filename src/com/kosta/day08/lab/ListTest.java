package com.kosta.day08.lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//배열 : 하나의 이름으로 같은 종류의 여러 값을 저장하기 위한 연속공간을 만드는 자료구조
		//속도 빠름, 갯수를 알아야 생성가능
		Shape[] arr = new Shape[5];
		arr[0] = new Rectangle(10, 20);
		arr[1] = new Rectangle(10, 20);
		
		
		//Collection - List, Set, Map interface
		//List : 순서가 있다. 중복허용, 초기값이 없으면 default 갯수만큼 생성, 자동으로 추가
		List<Rectangle> aList = new LinkedList<>();
		aList.add(new Rectangle(10, 20));
	}

}
