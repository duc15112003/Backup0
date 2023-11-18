package com.poly.testmaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteTest1 {
	public String message = "Fpoly";
	
	JUnitMessage junitMessage = new JUnitMessage(message);
	
	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage() {
		System.out.println("JUnit Message is printing");
		junitMessage.printMessage();
	}
	@Test 
	public void JUnitHiMessage() {
		message = "Hi!" + message;
		System.out.print("JUnit Hi Message is printing");
		assertEquals(message, junitMessage.printHiMessage());
		System.out.print("Suite Test 2 is successful " + message);
	}
	
}
