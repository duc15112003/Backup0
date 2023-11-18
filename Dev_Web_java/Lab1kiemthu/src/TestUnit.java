import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnit {
	
	@Test
	public void TestUnit1() {
		String str = "hello";
	
		assertEquals("hello", str);
	}
	
	@Test
	public void TestUnit2() {
		String str = "he";
	
		assertEquals("hello", str);
	}

}
