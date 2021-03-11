package com.kosta.day08;

public class MyClass {
	//field
	RemoteControl rc;
	
	//»ý¼ºÀÚ
	public MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	//method
	void methodA() {
		rc = new Audio();
	}
	
	void setRC(RemoteControl rc) {
		this.rc = rc;
	}

	@Override
	public String toString() {
		return "MyClass [rc=" + rc + "]";
	}
	
	
}
