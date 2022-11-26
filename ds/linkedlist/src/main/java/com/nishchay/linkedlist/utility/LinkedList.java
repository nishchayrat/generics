package com.nishchay.linkedlist.utility;

import com.nishchay.linkedlist.exceptions.ExceptionMesssages;
import com.nishchay.linkedlist.exceptions.LinkedListIndexOutOfBound;

public class LinkedList <T>{
	
	private Node<T> head;
	private int count=0;
	public void add(T data) {
		Node<T> temp = new Node<T>(data);
		temp.next = head;
		head=temp;
		count++;
	}
	public void add(T data , int index) throws LinkedListIndexOutOfBound {
		
		if(index<0 || index > count)
			throw new LinkedListIndexOutOfBound(ExceptionMesssages.IndexOutOfBound.getMessage());
		int currentIndex=0;
		Node<T> previousNode = null;
		Node<T> currentNode = head; 
		Node<T> newNode = new Node<T>(data);
		while(currentIndex<index) {
			previousNode=currentNode; 
			currentNode=currentNode.next;
			currentIndex++;
		}
		previousNode.next=newNode;
		newNode.next=currentNode;
		
	}
	public void print() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
	
