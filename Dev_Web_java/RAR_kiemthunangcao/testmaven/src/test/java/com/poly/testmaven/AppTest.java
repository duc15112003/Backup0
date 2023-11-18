package com.poly.testmaven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
	
	@Test
    public void TestIsEventNumber2()
    {
    	App demo1 = new App();
    	boolean result = demo1.isEventNumber(2);
        assertTrue(result);
    }
	@Test
	public void testApp() {
		assertTrue(true);
	}
	
    
    
    @Test
    public void TestIsEventNumber4()
    {
    	App demo1 = new App();
    	boolean result = demo1.isEventNumber(3);
        assertTrue(result);
    }
}
