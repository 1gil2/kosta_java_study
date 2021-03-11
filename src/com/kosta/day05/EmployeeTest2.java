package com.kosta.day05;

public class EmployeeTest2 {
	
	public static void main(String[] args) {
		Employee2 e1 = new Employee2("부장", "이부장", 1500);
		Employee2 e2 = new Employee2("과장", "이부장", 1300);
		Employee2 e3 = new Employee2("대리", "이부장", 1200);
		Employee2 e4 = new Employee2("사원", "이부장", 1000);
		
		e1.print();
		e2.print();
		e3.print();
		e4.print();
	
	
	}

}