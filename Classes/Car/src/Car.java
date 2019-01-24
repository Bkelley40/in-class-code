
public class Car {
	private String color;
	private static int numberOfCars = 0;
	
	public Car ()
	{
		this.color = "grey";
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
}
