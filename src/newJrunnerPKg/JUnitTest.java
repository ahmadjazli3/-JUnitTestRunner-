package newJrunnerPKg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest {
	
	@Test
	public void methodOne() {
		String str = "Hello";
		assertEquals("Hello", str);
	}
}
