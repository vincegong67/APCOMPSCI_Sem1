public abstract class Toy
{
	private String name;
	private double count;
	
	
	public Toy()
	{
		this.count = 1;
		this.name = "";
	}
	
	public Toy(String n)
	{
		this.count = 1;
		this.name = n;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(double c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getCount()
	{
		return count;
	} 
	
	public abstract String getType();
	
	public String toString()
	{
		return name + " " + count;
	}
	
}