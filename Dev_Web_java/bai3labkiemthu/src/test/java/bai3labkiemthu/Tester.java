package bai3labkiemthu;

import junit.framework.TestCase;
import org.junit.*;
public class Tester extends TestCase{
	public Tester(String testname) {
		// TODO Auto-generated constructor stub
		super(testname);
	}
	public void testapp() {
		assertTrue(true);
	}
	
	@Test
	public void testIsEventNumber2() {
		app demo2 = new app();
		boolean rs = demo2.isEvenNumber(2);
		assertTrue(rs);
	}
	
	@Test
	public void testIsEventNumber4() {
		app demo2 = new app();
		boolean rs = demo2.isEvenNumber(5);
		assertTrue(rs);
	}
}
