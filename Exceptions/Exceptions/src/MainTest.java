import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		
		try
		{
			Main.checkIsPositive(1);
			Main.checkIsPositive(-1);
			fail("Should not get here");
		}
		catch (NegativeNumberException e)
		{
			assertEquals("    -1 is not a positive integer.", e.getMessage());
		}
		
	}

}
