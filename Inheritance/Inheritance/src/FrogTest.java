import static org.junit.Assert.*;

import org.junit.Test;

public class FrogTest {

	@Test
	public void test() {
		Frog frogs[] = new Frog[3];
		frogs[0]= new Frog();
		assertEquals("green", frogs[0].getColor());
		assertEquals("garden pest", frogs[0].getName());


		frogs[1] = new Frog("red");
		assertEquals("red", frogs[1].getColor());
		assertEquals("garden pest", frogs[1].getName());
		
		frogs[2] = new Frog("Kermit", "grey");
		assertEquals("grey", frogs[2].getColor());
		assertEquals("Kermit", frogs[2].getName());
	
		frogs[2].move();
	}

}
