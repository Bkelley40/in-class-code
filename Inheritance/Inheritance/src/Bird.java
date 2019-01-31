
public class Bird extends Animal
{	
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
}
