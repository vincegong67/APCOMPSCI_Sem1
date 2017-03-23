public abstract class Car implements Location
{
	int ID;
	double[] location;
	
	public Car()
	{
		location = new double[2];
		ID = (int)(Math.random() * 999999) + 1;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[]getLoc()
	{
		return location;
	}
}
