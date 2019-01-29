import static org.junit.Assert.assertEquals;

public class Frog {
	private String color;
	private String name;
	
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
		this.name = name;
	}
	
	private void setColor (String color)
	{
		this.color = color;
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
