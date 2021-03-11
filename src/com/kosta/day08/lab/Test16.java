package com.kosta.day08.lab;

class Outer {
	private Inner y;
	
	public Inner getY() {
		return y;
	}
	public void setY(Inner y) {
		this.y = y;
	}

	class Inner{
		private int x;

		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		
	}
}

public class Test16 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		int n = 10;
		i.setX(n);
		o.setY(i);
		//i.setX(100);
		o.getY().setX(100);
		System.out.println(o.getY().getX());
	}
}
