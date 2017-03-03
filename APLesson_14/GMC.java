import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class GMC implements Location
{
	private double xpos,ypos;
	public GMC()
	{
		xpos = 0;
		ypos = 0;
	}
	
	public GMC(double x, double y)
	{
		xpos = x;
		ypos = y;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
	
	public void move(double x,double y)
	{
		xpos = x;
		ypos = y;
	}
	
	public double[] getLoc()
	{
		double location[]=new double[2];
		location[0] = xpos;
		location[1] = ypos;
		return location;
	}
}