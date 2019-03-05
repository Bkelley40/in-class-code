import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

	@Test
	public void test() {
		Integer[] numbers = {45,52,-12,0,7};
		Sort.sort(numbers);
		Integer[] sortedNumbers = {-12,0,7,45,52};
		assertArrayEquals(numbers, sortedNumbers);
	}

	@Test
	public void doubleTest()
	{
		Double[] numbers = {45.0,52.7,-12.3,0.1,7.1};
		Sort.sort(numbers);
		Double[] sortedNumbers = {-12.3,0.1,7.1,45.0,52.7};
		assertArrayEquals(numbers, sortedNumbers);
	}
}
