package com.mph.mvnproj;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculateTest {
	Calculate calc;
	@BeforeClass
	public static void setUpBeforeClass() throws java.lang.Exception
	{
		System.out.println("@Before class");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("@AfterClass");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before called");
		calc = new Calculate();
	}

	@After
	public void tearDown() throws java.lang.Exception
	{
		System.out.println("@After called");
		calc=null;
	}
	
	@Test
	public void testAdd() 
	{
		System.out.println("Add Test is called");
//		assertEquals(130, calc.add(10,20,100));
//		assertNotEquals(130, calc.add(10,20,100));
//		assertEquals(130, calc.add(10,20,70));
	}
	
	@Test
	public void testMultiply()
	{
		System.out.println("Multiply Test is called");
//		assertEquals(1300, calc.multiply(10,20,5));
//		assertEquals(1000, calc.multiply(10,20,5));
	}
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testDivide()
	{
		System.out.println("Divide Test is called");
		calc.divide();
		exception.expect(ArithmeticException.class);
		exception.expectMessage("Rule says Don't divide by 0 :(");

	}
}
