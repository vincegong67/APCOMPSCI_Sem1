import java.util.Scanner;
public class Lab_02part8
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter number 1: ");
		double radius = kb.nextInt();
		print(calcArea(radius),radius);
		
	}
	public static double calcArea(double radius)
	{
		return (radius*radius*3.14);
	}
	public static void print(double area, double radius)
	{
		System.out.println("The area of your circle with a radius of " + radius + "is " + area);
	}
}