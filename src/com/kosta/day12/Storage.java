package com.kosta.day12;

public interface Storage<T> {
	
	public abstract void add();
	public T get(int index);
	
	
}
