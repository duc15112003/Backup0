package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import BT.*;
public class MathFuncTest {
	@Before
	public void init() {
		MathFunc math = new MathFunc();
	}
	
	@After
	public void tearDown() {
		MathFunc math = null;
	}
	
	@Ignore
	@Test
	public void todo() {
		MathFunc math = null;
		assertTrue(math.plus(1,1)==2);// 
	}
	
	@Test
	public void calls() {
		MathFunc math = new MathFunc();
		assertEquals(0, math.getCalls());
		math.factorial(1);
		assertEquals(1, math.getCalls());
		math.factorial(1);
		assertEquals(2, math.getCalls());
	
	}
	@Test
	public void factorial() {
		MathFunc math = new MathFunc();
		assertTrue(math.factorial(0) == 1);
		assertTrue(math.factorial(1) == 1);
		assertTrue(math.factorial(5) == 120);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void factorialNegative() {
		MathFunc math = new MathFunc();
		math.factorial(-1);
	}
}
