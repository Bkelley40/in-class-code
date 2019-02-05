import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void test() {
		Animal zoo[] = new Animal[100];
		zoo[0] = new Frog("Kermit", "grey");
		assertEquals("grey", zoo[0].getColor());
		assertEquals("Kermit", zoo[0].getName());
		assertEquals("Jumping...", zoo[0].move());
		if (zoo[0].getClass().getName().equals("Frog"))
		{
			Frog kermit = (Frog)zoo[0];
			assertEquals(5, kermit.getWartCount());
		}
		//assertEquals(5, zoo[0].getWartCount());
		
		zoo[1] = new Bird();
		assertEquals("black", zoo[1].getColor());
		assertEquals("crow", zoo[1].getName());
		assertEquals("Moving...", zoo[1].move());
		
//		zoo[2] = null;
//		for ()
//		{
//			if (zoo[i] == null)
//		}
	}

}
