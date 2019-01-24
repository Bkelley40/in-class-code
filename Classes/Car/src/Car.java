import static org.junit.Assert.assertEquals;

public class Car {
	private String color;
	private static int numberOfCars = 0;
	private int speed = 0;
	
	public Car ()
	{
		this("grey");
	}
	
	public Car (String color)
	{
		this.color = color;
		++Car.numberOfCars;
	}
	
	public String getColor ()
	{
		return this.color;
	}
	
	public static int getNumberOfCars ()
	{
		return Car.numberOfCars;
	}
	
	public void accelerate (int speedChange)
	{
		this.speed += speedChange;
	}
	
	public int getSpeed ()
	{
		return this.speed;
	}
}
