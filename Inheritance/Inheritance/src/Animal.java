abstract public class Animal { // super
	private String color;
	private String name;

	public Animal (String name, String color)
	{
		this.setColor(color);
		this.setName(name);
	}
	
	public void setColor (String color)
	{
		this.color = color;
	}
	
	public String getColor ()
	{
		return this.color;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public String getName ()
	{
		return this.name;
	}
	
	abstract public String move ();
}
