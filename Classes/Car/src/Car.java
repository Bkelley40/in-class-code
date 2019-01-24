import static org.junit.Assert.assertEquals;

public class Car {
	private String color;
	private static int numberOfCars = 0;
	private int speed = 0;
	private Transmission transmission;
	private int gear;
	
	public Car ()
	{
		this("grey");
	}
	
	public Car (String color)
	{
		this(color, Transmission.MANUAL);
	}
	
	public Car (String color, Transmission t)
	{
		this.color = color;
		this.transmission = t;
		++Car.numberOfCars;
		this.gear = 1;
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
		++this.gear;
		this.speed += speedChange;
	}
	
	public int getSpeed ()
	{
		return this.speed;
	}
	
	public String getGear ()
	{
		if (this.transmission == Transmission.AUTOMATIC)
		{
			return "drive";
		}
		return ""+this.gear;
	}
}
