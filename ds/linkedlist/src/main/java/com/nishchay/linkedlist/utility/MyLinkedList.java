package com.nishchay.linkedlist.utility;

public class MyLinkedList <T>{

	private Node<T> head;
	private int count=0;
	public void addFirst(T data) {
		Node<T> temp = new Node<T>(data);
		temp.next = head;
		head=temp;
		count++;
	}
	public void add(T data , int index) {
		
	}
	public void print() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
