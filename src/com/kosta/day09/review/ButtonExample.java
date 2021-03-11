package com.kosta.day09.review;

public class ButtonExample {

	public static void method(Button.OnClickListener listener) {
		Button button = new Button();
		button.setListener(listener);
		button.touch();
	}

	public static void main(String[] args) {
		
		method(new MassageListener());
		method(new CallListener());
		method(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("익명 구현 class");				

			}
		});
	}
}
