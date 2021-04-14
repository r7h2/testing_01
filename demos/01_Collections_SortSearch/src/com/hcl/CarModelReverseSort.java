package com.hcl;

import java.util.Comparator;

public class CarModelReverseSort implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o2.getModel().compareTo(o1.getModel());
	}

}
