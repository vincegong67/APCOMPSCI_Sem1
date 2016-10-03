import java.util.Scanner;
public class Lab_02part6
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter number 1: ");
		int num1 = kb.nextInt();
		System.out.println("Please enter number 2: ");
		int num2 = kb.nextInt();
		System.out.println("Please enter number 3: ");
		int num3 = kb.nextInt();
		print(calcAverage(num1, num2, num3),num1,num2,num3);
		
	}
	public static int calcAverage(int num1, int num2, int num3)
	{
		return ((num1+num2+num3)/3);
	}
	public static void print(int average, int num1, int num2, int num3)
	{
		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
	}
}