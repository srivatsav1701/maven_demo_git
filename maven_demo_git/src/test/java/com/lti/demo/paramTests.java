package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class paramTests {
	
	//testCases --->no is even
	//multiple param --->
	

	@Disabled
	@ParameterizedTest
	@ValueSource(ints= {8,10,20,5,100})
	public void testArrays(int arg) {
		System.out.println("arg :"+arg);
		Assertions.assertTrue(arg%2==0);
	}
	
	
	@ParameterizedTest
	@DisplayName("Should pass all non-null arguments")
	@ValueSource(strings= {"hello","vatsav","get1024"})
	public void testparam(String msg) {
		Assertions.assertNotNull(msg);
	}
	
	@RepeatedTest(3)
	public void shouldrepeat() {
		int x=10,y=20;
		assertEquals(200,x*y);
	}
	
	@Test
	public void tesrlambda() {
		Integer[] a= {2,3,7,5,10};
		List<Integer> numbers=Arrays.asList(a);
		

		Assertions.assertAll(
				() -> assertEquals(2,numbers.get(0)),
				() -> assertEquals(3,numbers.get(1)),
				() -> assertEquals(7,numbers.get(2)),
				() -> assertEquals(5,numbers.get(3)),
				() -> assertEquals(10,numbers.get(4))
				);
	}
	
	@Test
	void testExceptions() {
		Assertions.assertThrows(NumberFormatException.class, () ->{
			Integer.parseInt("One");
		});
	}

}
