package com.kosta.day12;

public class Util {
	
	public static <T extends Number> int compare1(T a, T b) {
		double su1 = a.doubleValue();
		double su2 = b.doubleValue();
		
		return Double.compare(su1, su2);
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean result = false;
		result = p1.getKey().equals(p2.getKey()) && p1.getVal().equals(p2.getVal());
		
		return result;
	}	
	
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;
	}

}
