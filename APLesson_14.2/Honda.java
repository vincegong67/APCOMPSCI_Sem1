import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Honda extends Car
{
	private double xpos,ypos;
	
	public Honda()
	{
		location = new double[2];
	}
	public Honda(double[] loc)
	{
		location = loc;
	}
	
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x,double y)
	{
		xpos += x;
		ypos += y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xpos;
		location[1] = ypos;
		return location;
	}
}