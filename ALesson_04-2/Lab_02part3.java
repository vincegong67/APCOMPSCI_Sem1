import java.util.Scanner;
public class Lab_02part3
{
	static String var1= "The surface area of a cube with  ";
	static String var2= " sides ";
	static double side;
	static double surface;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter cube side");		
		side = kb.nextDouble();
		surface();
	
	}
	
	public static void surface()
	{
		surface= (side*side*6);
		System.out.println(var1 + side +var2 + surface);
	}

}