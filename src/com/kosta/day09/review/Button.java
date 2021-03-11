package com.kosta.day09.review;

class MassageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("MassageListener Ŭ���Ѵ�.");
	}
}

class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("CallListener Ŭ���Ѵ�.");
	}
}

public class Button {
	OnClickListener listener; 
	
	void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	//�Ϲ� �޼���
	void touch() {
		listener.onClick();
	}
	//inner interface
	interface OnClickListener{
		void onClick();
	}
}
