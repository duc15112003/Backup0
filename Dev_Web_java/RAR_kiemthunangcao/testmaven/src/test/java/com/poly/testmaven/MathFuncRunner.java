package com.poly.testmaven;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;

public class MathFuncRunner {
	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore();
		org.junit.runner.Result result = runner.run(MathFuncTest.class);
		System.out.print("run tests: " + result.getRunCount());
		System.out.print("\n failed tests: " + result.getFailureCount());
		System.out.print("\n ignored tests: " + result.getIgnoreCount());
		System.out.print("\n success: "+ result.wasSuccessful());
	}
}
