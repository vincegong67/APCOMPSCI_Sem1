import java.util.Scanner;
public class Lab_02part7
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter cube length: ");
		int l = kb.nextInt();
		print(calcSurface(l),l);
		
	}
	public static double calcSurface(int l)
	{
		return ((l*l)*6);
	}
	public static void print(double surface, int l)
	{
		System.out.println("The surface area of a cube with sides " + l + " is " + surface);
	}
}