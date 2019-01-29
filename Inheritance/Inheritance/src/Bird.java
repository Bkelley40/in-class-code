
public class Bird {
	
	public Bird ()
	{
		this("crow", "black");
	}
	
	public Bird (String color)
	{
		this("crow", color);
	}
	
	public Bird (String name, String color)
	{
		this.color = color;
		this.name = name;
	}
	
	public String getColor ()
	{
		return this.color;
	}

	public String getName ()
	{
		return this.name;
	}
}
