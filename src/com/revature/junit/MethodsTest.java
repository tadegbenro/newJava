package com.revature.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MethodsTest {
	
	Methods m; //Add this line

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Thsi method runs before all methods in the class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		m = new Methods();
	}

	@After
	public void tearDown() throws Exception {
		m = null;
	}

	@Test
	public void testAdd() {
		//testing add(1,2,3,4)
		int expected = 10;
		int actual = m.add(1,2,3,4);
		assertEquals(expected, actual);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testAnagram() {
		assertTrue(m.anagram("hello",  "lehlo"));
		assertFalse(m.anagram("123", "1"));
		//fail("Not yet implemented");
	}

}
