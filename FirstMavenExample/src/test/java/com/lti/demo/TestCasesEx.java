package com.lti.demo;


import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCasesEx {
	
	//ctr+ shift+ o
	
	//ctr+shift +/
	
	@Disabled
	  @Test public void testCase1() { //expected // actual
	  Assertions.assertEquals("Hello","Hello");
	  Assertions.assertEquals(500,200+500,"addition pass  "); }
	 
	@Disabled
	@Test
	public void testAdd()
	{
		Calculator c= new Calculator();
		
		int r= c.add(300, 200);		
		
		Assertions.assertEquals(500,r);
	}
	
	@Disabled
	@Test
	void testAssertEqual() {
		Assertions.assertEquals("ABC", "ABC");
		Assertions.assertEquals(20, 20, "optional assertion message");
		Assertions.assertEquals(2 + 2, 4);
	}

	@Test
	void testAssertFalse() {	
		Assertions.assertFalse("FirstName".length() == 10);
		Assertions.assertFalse(10 > 20, "assertion message");
	}

	@Disabled
	@Test
	void testAssertNull() {
	     String str1 = null;
		 String str2 = "abc";
		 Assertions.assertNull(str1);// str 1 is null - condition is ok  test case ok 
		 Assertions.assertNotNull(str2);	 // str2 - notnull ? - condtion is ok - test case ok 
	}
	
	@Test
	public void testEmptyArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Assertions.assertEquals(0, al.size());
		Assertions.assertTrue(al.isEmpty()); // assertTrue Method
		al.add(100);
		al.add(200);		
		Assertions.assertEquals(0, al.size());
		// assertFalse(al.isEmpty());
	}
	
	
}
