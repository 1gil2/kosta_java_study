package com.kosta.day14;

import java.util.List;

public class MyThreadA extends Thread{

	List<String> list; 

	public MyThreadA(String name, List<String> list) {
		super(name);
		this.list = list;

	}

	@Override
	public void run() {
		while(true) {
			synchronized (list) {
				for(int i = 0; true; i++) {
					list.add(i + "");
					System.out.println(i + "추가완료~");
				}	
			}
		}
	}


}
