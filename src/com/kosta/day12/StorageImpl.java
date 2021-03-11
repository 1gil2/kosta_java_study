package com.kosta.day12;

public class StorageImpl<T, A> implements Storage<T>{
	A price;
	T[] array;
	@SuppressWarnings("unchecked")
	public StorageImpl(int capacity) {
		array = (T[]) new Object[capacity];
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
