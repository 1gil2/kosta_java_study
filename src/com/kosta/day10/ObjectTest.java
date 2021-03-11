package com.kosta.day10;

import java.util.Arrays;

public class ObjectTest {

	public static void main(String[] args) {
		sample7();

	}

	private static void sample7() {
		Book[] booklist = new Book[5];
		booklist[0] = new Book("자바", 10000, false);
		booklist[1] = new Book("자바", 8000, true);
		booklist[2] = new Book("c++", 25000, false);
		booklist[3] = new Book("sql", 15000, false);
		booklist[4] = new Book("sql", 15300, false);
		
		for(Book book : booklist) {
			System.out.println(book);
		}
		System.out.println();
		Arrays.sort(booklist);
		for(Book book : booklist) {
			System.out.println(book);
		}
		System.out.println();
		Arrays.sort(booklist, new BookDescComparator());
		for(Book book : booklist) {
			System.out.println(book);
		}
	}

	private static void sample6() {
		Car[] carList = new Car[3]; 
		carList[0] = new Car("C", 2000);
		carList[1] = new Car("B", 1000);
		carList[2] = new Car("C", 3000);
		
		System.out.println(Arrays.toString(carList));
		Arrays.sort(carList);
		System.out.println(Arrays.toString(carList));
		Arrays.sort(carList, new CarDesc());
		System.out.println(Arrays.toString(carList));
		
	}

	private static void sample5() {
		Integer[] arr = {10, 3, 5, 8, 4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new IntegerDesc());
		System.out.println(Arrays.toString(arr));
		
	}

	private static void sample4() {
		int[] arr = {10, 3, 5, 8, 4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Car[] carList = new Car[3]; 
		carList[0] = new Car("D", 2000);
		carList[1] = new Car("B", 1000);
		carList[2] = new Car("C", 3000);
		
		System.out.println(Arrays.toString(carList));
		Arrays.sort(carList);
		System.out.println(Arrays.toString(carList));
	}

	private static void sample3() {
		Car car1 = new Car("모델5", 3000);
		Car car2 = new Car("모델5", 6000);
		
		int result = car1.compareTo(car2);
		System.out.println(result > 0 ? "car1크다.":"car2 같거나 크다.");
		
	}

	private static void sample2() {
		String s1 = "자바";
		String s2 = "자바";
		
		//같다 : 0, s2 - s1
		System.out.println(s1.compareTo(s2));
		
		s1 = "A"; //65
		s2 = "C"; //67
		System.out.println(s1.compareTo(s2));
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		
	}

	private static void sample1() {
		Car car1 = new Car("모델", 1000);
		System.out.println(car1);
		System.out.println(car1.hashCode());
		car1 = null;
		car1 = new Car("모델", 1000);
		System.out.println(car1);
		System.out.println(car1.hashCode());
	}

}
