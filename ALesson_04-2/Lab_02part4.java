import java.util.Scanner;
public class Lab_02part4
{
	static String var1= "The area of your circle with a radius of ";
	static String var2= " is ";
	static double pi= 3.14159;
	static double radius;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter radius:");		
		radius = kb.nextDouble();
		area();
	
	}
	
	public static void area()
	{
		area= (pi*radius*radius);
		System.out.println(var1 + radius + var2 + area);
	}
}