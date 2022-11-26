package com.nishchay.linkedlist.utility;

import com.nishchay.linkedlist.exceptions.ExceptionMesssages;
import com.nishchay.linkedlist.exceptions.LinkedListIndexOutOfBound;

public class LinkedList <T>{
	
	private Node<T> head;
	private int count=0;
	
	public int size() {
		int length=0;
		Node<T> temp = head;
 		while(temp!=null) {
			length++;
			temp=temp.next;
		}
		return length;
	}
	public void add(T data) {
		Node<T> temp = new Node<T>(data);
		temp.next = head;
		head=temp;
		count++;
	}
	public void add(T data , int index) throws LinkedListIndexOutOfBound {
		
		int length = size();
		if(index<=0 || index-1 > length)
			throw new LinkedListIndexOutOfBound(ExceptionMesssages.IndexOutOfBound.getMessage());
		int currentIndex=0;
		Node<T> previousNode = null;
		Node<T> currentNode = head; 
		Node<T> newNode = new Node<T>(data);
		while(currentIndex<index-1) {
			previousNode=currentNode; 
			currentNode=currentNode.next;
			currentIndex++;
		}
		if(previousNode!=null) {
			previousNode.next=newNode;
			newNode.next=currentNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	public void print() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
	
