import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car car1 = new Car("red");
		assertEquals("red", car1.getColor());
		
		Car car2 = new Car();
		assertEquals("grey", car2.getColor());
	}

}
