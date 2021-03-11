package com.kosta.day10;

import java.util.Comparator;

public class CarDesc implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		int result = o1.getModel().compareTo(o2.getModel())*-1;
		if(result == 0)
			return o2.getPrice() - o1.getPrice();
		return result;
	}

}
