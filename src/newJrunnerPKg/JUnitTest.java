package newJrunnerPKg;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void methodOne() {
		String str = "Hello";
		assertEquals("Hello", str);
	}

	@Test
	public void methodTwo() {
		
		String str1 = "A";
		assertAll("numbers", 
				() -> assertEquals(str1, "A"), 
				() -> assertFalse(1 > 9), 
				() -> assertNull(null),
				() -> assertNotNull("Z"), 
				() -> assertTrue(1 < 9));
	}

	@Test
	public void methodThree() {

		assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("Hello");
		});
	}

}
