package com.kosta.day07;

public class ParentClass {
	String nation;
	
	ParentClass(String nation){
		this.nation = nation;
		System.out.println("1.Parent call");
	}
	
	ParentClass(){
		this("���ѹα�");
		System.out.println("2.Parent(String nation) call");
	}

}
