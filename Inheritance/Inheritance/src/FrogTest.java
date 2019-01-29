import static org.junit.Assert.*;

import org.junit.Test;

public class FrogTest {

	@Test
	public void test() {
		Frog kermit = new Frog("green");
		assertEquals("green", kermit.getColor());
	}

}
