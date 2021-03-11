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
		if (title == "����") {
			totalSalary = (int)(baseSalary + baseSalary *(0.25));
		}
		else if (title == "����"){
			totalSalary = (int)(baseSalary + baseSalary*(0.15));
		}
		else {
			totalSalary = (int)(baseSalary + baseSalary*(0.05));
		}
	}
	
	public void print() {
		getTotalSalary();
		System.out.println(title + "������ " + name + "���� ������ " + baseSalary + " ���̰� �ѱ޿��� " + totalSalary + " ���Դϴ�.");
	}
	
}
