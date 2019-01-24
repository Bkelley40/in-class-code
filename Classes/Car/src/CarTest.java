import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		assertEquals(0, Car.getNumberOfCars());
		Car car1 = new Car("red");
		assertEquals("red", car1.getColor());
		
		car1.accelerate(20);
		assertEquals(20, car1.getSpeed());
		car1.accelerate(33);
		assertEquals(53, car1.getSpeed());
		
		Car car2 = new Car();
		assertEquals("grey", car2.getColor());
		
		assertEquals(2, Car.getNumberOfCars());
	}
}
