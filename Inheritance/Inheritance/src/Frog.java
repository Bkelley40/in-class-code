import static org.junit.Assert.assertEquals;

public class Frog extends Animal {

	private int wartCount;
	
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
		super(name, color);
		this.wartCount = 5;
	}
	
	public void move ()
	{
		System.out.println("Jumping...");
	}
}
