package com.kosta.day07;

public class Speaker implements Volume{

	private int VolLevel;
	
	public Speaker() {
	
	}
	
	public Speaker(int VolLevel) {
		this.VolLevel = VolLevel;
	}
	
	@Override
	public void volumeUp(int level) {
		if(VolLevel+level > 100)
			VolLevel = 100;
		else
			VolLevel += level;
		System.out.println(getClass().getSimpleName() + "���� �ø��ϴ�. " + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		if(VolLevel - level < 0)
			VolLevel = 0;
		else
			VolLevel -= level;
		System.out.println(getClass().getSimpleName() + "���� �����ϴ�. " + VolLevel);		
	}
	
	

}
