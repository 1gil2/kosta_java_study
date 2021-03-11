package com.kosta.day09.review;

class MassageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("MassageListener 클릭한다.");
	}
}

class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("CallListener 클릭한다.");
	}
}

public class Button {
	OnClickListener listener; 
	
	void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	//일반 메서드
	void touch() {
		listener.onClick();
	}
	//inner interface
	interface OnClickListener{
		void onClick();
	}
}
