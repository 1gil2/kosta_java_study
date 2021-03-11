package com.kosta.day11;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {

	public static void main(String[] args) {
		method3();

	}

	private static void method3() {
		Car[] arr = new Car[5];
		arr[0] = new Car("A", 5000);
		arr[1] = new Car("B", 3000);
		arr[2] = new Car("Z", 1000);
		arr[3] = new Car("A", 2000);
		arr[4] = new Car("F", 5000);
		
		print("before", arr);
		Arrays.sort(arr);
		print("after", arr);
		
		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o2.getPrice() - o1.getPrice();
			}
		});
		print("after2", arr);
		
		System.out.println(Arrays.binarySearch(arr, new Car("B", 3000)));
		

	}

	private static void print(String string, Car[] arr) {
		System.out.println("-----------" + string + "-----------");
		for(Car car: arr) {
			System.out.println(car);
		}
		System.out.println();
	}

	private static void method2() {
		Character[] arr = {'J', 'A', 'V', 'A'};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 'V') + "번째");
			
	}

	private static void method1() {
		Character[] arr = {'J', 'A', 'V', 'A'};
		Character[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println("원본 : " + Arrays.toString(arr));
		System.out.println("복사본 : " + Arrays.toString(arr2));
		
		Character[] arr3 = new Character[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.out.println("3 : " + Arrays.toString(arr3));
		
		System.out.println(Arrays.equals(arr, arr2));
		
		Arrays.sort(arr);
		System.out.println("asc : " + Arrays.toString(arr));

		Arrays.sort(arr, new CharDesc());
//		Arrays.sort(arr, new Comparator<Character>() {
//
//			@Override
//			public int compare(Character o1, Character o2) {
//				//return o2.compareTo(o1);
//				return o2 - o1;
//			}
//		});
		System.out.println("desc : " + Arrays.toString(arr));
	}

}

class CharDesc implements Comparator<Character>{

	@Override
	public int compare(Character o1, Character o2) {

		return o2.compareTo(o1);
	}
	
}