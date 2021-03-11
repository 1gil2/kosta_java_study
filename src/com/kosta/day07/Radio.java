package com.kosta.day07;

public class Radio implements Volume{
	
	private int VolLevel;
	
	public Radio(){
		
	}
	
	public Radio(int VolLevel) {
		this.VolLevel = VolLevel;
	}

	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println(getClass().getSimpleName() + "���� �ø��ϴ�. " + VolLevel);
		
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		System.out.println(getClass().getSimpleName() + "���� �����ϴ�. " + VolLevel);
	}

	
	
}
