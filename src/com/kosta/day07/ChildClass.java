package com.kosta.day07;

public class ChildClass extends ParentClass{
	
	private String name;
	
	public ChildClass() {
		this("ȫ�浿");
		System.out.println("4.ChildClass() call");
	}
	
	public ChildClass(String name) {
		
		this.name = name;
		System.out.println("3.ChildClass(String name) call");
	}

}
