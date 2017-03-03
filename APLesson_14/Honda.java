import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Honda implements Location
{
	private double xpos,ypos;
	private int id;
	public Honda(double[] honLoc)
	{
		xpos = honLoc[0];
		ypos = honLoc[1];
	}
	
	public void setID()
	{
		id = (int)(Math.random() * 999999) + 1;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void move(double x,double y)
	{
		xpos = x;
		ypos = y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = xpos;
		location[1] = ypos;
		return location;
	}
}