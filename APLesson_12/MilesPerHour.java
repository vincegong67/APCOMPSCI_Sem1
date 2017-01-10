import static java.lang.Math.*;
public class MilesPerHour
{
	static int distance;
	static int hours;
	static int minutes;
	static double mph;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int dist, int hrs, int min)
	{
		distance = dist;
		hours =hrs;
		minutes = min;
		mph = 0;
	}
	
	public void setMinutes(int min)
	{
		minutes = min;
	}
	
	public void setHours(int hrs)
	{
		hours = hrs;
	}
	
	public void setDistance(int dist)
	{
		distance = dist;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
	
	
	
}