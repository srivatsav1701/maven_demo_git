package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.calculator;

class BeforAterTest {
	int sum;

	calculator c=new calculator();
	
	@BeforeAll
	public static void testDbConn() {
		System.out.println("Db conn is up");
	}
	
	@BeforeEach
	public void testStartUp() {
		sum=0;
		System.out.println("sum =0");
	}
	
	
	@Test
	public void testAdd() {
		sum=c.add(100, 200);
		Assertions.assertEquals(300, sum,"Checked add method");
	}
	
	@Test
	public void testAdd1() {
		sum=c.add(100, 200);
		Assertions.assertEquals(300, sum,"Checked add method");
	}
	
	@AfterEach
	public void testShitDown() {
		c=null;
		sum=0;
		System.out.println("sum ==0 shutdown");
	}
	
	@AfterAll
	public static void testDbConnnull() {
		System.out.println("Db conn is null");
	}

}
