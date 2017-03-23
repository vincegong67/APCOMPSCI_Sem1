import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Toyota extends Car
{
	private int id;
	private double xpos,ypos;
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String loc)
	{
		location[0] = Double.parseDouble(loc.substring(0, loc.indexOf(", ")));
		location[1] = Double.parseDouble(loc.substring(loc.indexOf(", ") + 2));
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
		double [] location = {xpos,ypos};
		return location;
	}
}