package bai3labkiemthu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

public class test1 extends TestCase{
	public test1(String testname) {
		// TODO Auto-generated constructor stub
		super(testname);
	}
	public void testapp() {
		assertTrue(true);
	}
	
	@Test
	public void testboso1() {
		giaipt demo2 = new giaipt();
		boolean rs = demo2.ispt(2,4);
		assertTrue(rs);
	}
	
	@Test
	public void testboso2() {
		giaipt demo2 = new giaipt();
		boolean rs = demo2.ispt(0,5);
		assertTrue(rs);
	}
}
