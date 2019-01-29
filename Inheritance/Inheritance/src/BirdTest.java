import static org.junit.Assert.*;

import org.junit.Test;

public class BirdTest {

	@Test
	public void test() {
		Bird[] birds = new Bird[3];
		birds[0] = new Bird();
		
		assertEquals("black", birds[0].getColor());
//		assertEquals("garden pest", f1.getName());
//
//
//		Frog f2 = new Frog("red");
//		assertEquals("red", f2.getColor());
//		assertEquals("garden pest", f2.getName());
//
//		
//		Frog kermit = new Frog("Kermit", "grey");
//		assertEquals("grey", kermit.getColor());
//		assertEquals("Kermit", kermit.getName());
//		
	}

}
