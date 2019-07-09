package com.pack.testingdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	Calculator c1;
	@Test
	public void testAdd() {
		System.out.println("Add test");
		assertEquals("add faillllllll",30, c1.add(10, 20));
	}

	@Test
	public void testSub() {
		System.out.println("Sub test");
		assertEquals("sub faillllllll",10, c1.sub(30, 20));
	}
	
	@Before
	public void createObjecct() {
		c1= new Calculator();
		System.out.println("-----------------------\nObject created!");
	}
	
	@After
	public void removeObject() {
		c1= null;
		System.out.println("Object dereferenced \n-----------------------");
	}
	
	@BeforeClass
	public static void abc() {
		System.out.println("FIRST");
	}
	
	@AfterClass
	public static void xyz() {
		System.out.println("LAST");
	}
	
	@Test
	public void isEqual() {
		assertTrue("a & b not equal!!",c1.compare(200, 20));
	}
}
