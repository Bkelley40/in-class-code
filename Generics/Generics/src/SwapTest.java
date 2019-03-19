import static org.junit.Assert.*;

import org.junit.Test;

public class SwapTest {

	@Test
	public void test() {
		Integer myArr[] = new Integer[4];
		myArr[0] = 3;
		myArr[2] = 4;
		Swap.swap(myArr, 0, 2);
		assertEquals(4, myArr[0].intValue());
		assertEquals(3, myArr[2].intValue());
		
		String mySArr[] = new String[4];
		mySArr[0] = "hello";
		mySArr[2] = "world";
		Swap.swap(mySArr, 0, 2);
		assertEquals("world", mySArr[0]);
		assertEquals("hello", mySArr[2]);
	}

}
