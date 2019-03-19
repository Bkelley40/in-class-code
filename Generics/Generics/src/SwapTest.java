import static org.junit.Assert.*;

import org.junit.Test;

public class SwapTest {

	@Test
	public void test() {
		int myArr[] = new int[4];
		myArr[0] = 3;
		myArr[2] = 4;
		Swap.swap(myArr, 0, 2);
		assertEquals(4, myArr[0]);
		assertEquals(3, myArr[2]);
	}

}
