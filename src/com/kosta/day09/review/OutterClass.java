package com.kosta.day09.review;

public class OutterClass extends Object implements Comparable<OutterClass>{
	//1. field : non-static, static
	//2. constructor
	//3. method : non-static, static
	//4. static block, instance block
	//5. inner class, inner interface
	class InnerClass{

	}

	static class InnerClass2{
		
	}
	
	void test() {
		class InnerClass3{
			
		}
		
		InnerClass3 aa = new InnerClass3() {
			
		};
	}

	@Override
	public int compareTo(OutterClass o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
