package com.nishchay.linkedlist;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.nishchay.linkedlist.exceptions.ExceptionMesssages;
import com.nishchay.linkedlist.exceptions.LinkedListIndexOutOfBound;
import com.nishchay.linkedlist.utility.LinkedList;

@RunWith(MockitoJUnitRunner.class)
public class LinkedListTest {
	
	
	
	@Test
	public void shouldReturnZeroIfListIsEmpty() {
		System.out.println(ExceptionMesssages.IndexOutOfBound.getMessage());
	}
	
	@Test
	public void addShouldThrowExceptionWhenIndexIsOutOfBound() {
		
		
		
	}
}
