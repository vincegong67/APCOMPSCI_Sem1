public class Car extends Toy
{
	private String name, type;
	private double count;
	
	public Car()
	{
		super();
	}
	
	public Car(String n)
	{
		super(n);
	}
		
	public String getType()
	{
		return "Car";
	}
}