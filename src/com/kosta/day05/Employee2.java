package com.kosta.day05;

public class Employee2 {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Employee2() {
		
	}
	
	public Employee2(String name, String title, int baseSalary) {
		super();
		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
	}

	public void getTotalSalary() {
		if (title == "부장") {
			totalSalary = (int)(baseSalary + baseSalary *(0.25));
		}
		else if (title == "과장"){
			totalSalary = (int)(baseSalary + baseSalary*(0.15));
		}
		else {
			totalSalary = (int)(baseSalary + baseSalary*(0.05));
		}
	}
	
	public void print() {
		getTotalSalary();
		System.out.println(title + "직급의 " + name + "씨의 본봉은 " + baseSalary + " 원이고 총급여는 " + totalSalary + " 원입니다.");
	}
	
}
