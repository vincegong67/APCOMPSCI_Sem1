import java.util.Scanner;
public class Lab_06part2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please Enter Your Number: ");
		double number =kb.nextInt();
		double result = 1;
		for(double totalint = number; number > 0; number--)
		{
			result = number*result;
		}
			System.out.println("Your Factorial is " + result);
	}
}