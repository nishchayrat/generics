package com.nishchay;

public class DSComparator <T extends Comparable<T>> implements IDSComparator<T> {

	@Override
	public int compare(T object1, T object2) {
		return object1.compareTo(object2);
	}

	
}
