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
		System.out.println(getClass().getSimpleName() + "볼륨 올립니다. " + VolLevel);
		
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다. " + VolLevel);
	}

	
	
}
