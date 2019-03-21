import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MaxTest {

	@Test
	public void test() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(2);
		numbers.add(17);
		numbers.add(-4);
		
		Integer maxNum = Max.max(numbers);
		assertEquals(17, maxNum.intValue());
	}

}
