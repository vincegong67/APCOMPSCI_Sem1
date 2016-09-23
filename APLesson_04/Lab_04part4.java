import java.util.Scanner;

public class Lab_04part4
{
	public static void main(String[]args)
	{
		Lab_04part4 average = new Lab_04part4();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter Height:");
		double h = kb.nextDouble();
		System.out.println("Please enter Length:");
		double l = kb.nextDouble();
		System.out.println("Please enter Width:");
		double w = kb.nextDouble();

		double size = average.CubeFeet(h,l,w);
		System.out.printf("Your Volume in Cubic Feet is %6.2f\n" , size);
	}
	
	public double CubeFeet(double h, double l, double w)
	{
		
		return ((h*l*w)*0.000578704);
	}
}