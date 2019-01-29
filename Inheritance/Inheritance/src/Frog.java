import static org.junit.Assert.assertEquals;

public class Frog extends Animal {

	public Frog ()
	{
		this("green");
	}
	
	public Frog (String color)
	{
		this("garden pest", color);
	}
	
	public Frog (String name, String color)
	{
		this.setColor(color);
		this.setName(name);
	}
}
