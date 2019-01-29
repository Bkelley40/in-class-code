import static org.junit.Assert.*;

import org.junit.Test;

public class FrogTest {

	@Test
	public void test() {
		Frog f1 = new Frog();
		assertEquals("green", f1.getColor());
		assertEquals("garden pest", f1.getName());


		Frog f2 = new Frog("red");
		assertEquals("red", f2.getColor());
		assertEquals("garden pest", f2.getName());

		
		Frog kermit = new Frog("Kermit", "grey");
		assertEquals("grey", kermit.getColor());
		assertEquals("Kermit", kermit.getName());
		
	}

}
