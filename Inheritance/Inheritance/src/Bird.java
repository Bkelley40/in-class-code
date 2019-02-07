
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
		super(name, color);
	}
	
	@Override
	public String move ()
	{
		return "Flapping...";
	}
}
