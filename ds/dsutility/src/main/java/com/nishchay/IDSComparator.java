package com.nishchay;

public interface IDSComparator <T extends Comparable<T>>{
	public int compare(T object1,T object2);
}
