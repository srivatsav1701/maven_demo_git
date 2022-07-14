package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.calculator;

class Calculatortest {

  calculator c=new calculator();
	

	//@Disabled
	@Test
	public void testAdd() {
		int r=c.add(100, 200);
		Assertions.assertEquals(300, r,"Checked add method");
	}
	
	@Test
	public void testAssertFalse() {
		Assertions.assertEquals("Hello", "Hello");
		Assertions.assertFalse("Vatsav".length()==2);
	}
	
	@Test
	public void testAssertNull() {
		String s1="abc";
		String s2=null;
		Assertions.assertNull(s2);
	}
	
	@Test
	public void testArrayList() {
		ArrayList<Integer> myl=new ArrayList<Integer>();
		Assertions.assertEquals(0, myl.size());
		Assertions.assertTrue(myl.isEmpty());
		
		myl.add(100);
		myl.add(200);
		
		Assertions.assertEquals(2, myl.size());
	}
	

}
