import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class GMC extends Car
{
	private double xpos,ypos;
	
	public GMC()
	{
		location = new double[2];
		
	}
	
	public GMC(double x, double y)
	{
		location[0] = x;
		location[1] = y;
	}
	
}