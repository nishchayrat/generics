package com.nishchay.linkedlist;



import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.nishchay.linkedlist.exceptions.ExceptionMesssages;
import com.nishchay.linkedlist.exceptions.LinkedListIndexOutOfBound;
import com.nishchay.linkedlist.utility.LinkedList;

@RunWith(MockitoJUnitRunner.class)
public class LinkedListTest {
	private LinkedList<Integer> list;
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Before
	public void init() {
		list=new LinkedList<Integer>();
		
	}
	
	@Test
	public void addShouldSucced() throws LinkedListIndexOutOfBound {
		
		

	}
	
	@Test
	public void addShouldThrowExceptionWhenIndexIsOutOfBound() throws LinkedListIndexOutOfBound {		
expectedException.expect(LinkedListIndexOutOfBound.class);
		
		//Below line check insertion in empty list
		list.add(1,1);
		//check insertion at the end of list
		list.add(3,2);
		
		//check insertion at
		
		//below Line through the expected exception
		list.add(4,4);
	}
	
	
	
}
