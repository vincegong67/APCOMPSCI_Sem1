public class AFigure extends Toy
{
	private String name, type;
	private double count;
	
	public AFigure()
	{
		super();
	}
	
	public AFigure(String n)
	{
		super(n);
	}
		
	public String getType()
	{
		return "AFigure";
	}
	
	public String getName()
	{
		return name;
	}
		
	public double getCount()
	{
		return count;
	}

}